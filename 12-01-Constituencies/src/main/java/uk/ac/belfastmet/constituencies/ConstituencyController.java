package uk.ac.belfastmet.constituencies;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.constituencies.domain.AllMembersList;
import uk.ac.belfastmet.constituencies.domain.Member;

@Controller
@RequestMapping("/")

public class ConstituencyController {

	@GetMapping ("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "HomePage");
		return ("homePage");

	}
	
	@GetMapping("/constituency/{constituencyId}")
	public String singleEvent(Model model, @PathVariable("constituencyId") String constituencyId)
	{
		model.addAttribute("pageTitle", "Constituency");

		
		String membersUrl = "https://api.myjson.com/bins/y888n";

		RestTemplate restTemplate = new RestTemplate();
		AllMembersList members = restTemplate.getForObject(membersUrl, AllMembersList.class);
		ArrayList<Member> requestedMembers = new ArrayList<Member>();


		for(Member member: members.getAllMembers())
		{

			if (member.getConstituencyId().equals(constituencyId))
			{
				requestedMembers.add(member);
			}

		}

		model.addAttribute("members", requestedMembers);
		return "mlaPage";
	}
}