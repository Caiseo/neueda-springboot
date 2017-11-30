package uk.ac.belfastmet.buildings.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.buildings.domain.Building;

@Service

public class BuildingService {
	private ArrayList<Building> largestfloorareaBuilding;

	public BuildingService() {
		super();
	}

	public ArrayList<Building> getLargestFloorArea() {
		ArrayList<Building> LargestFloorArea = new ArrayList<Building>();

		Building ncgc = new Building("New Century Global Center", "China", 1760000, "lfa1.jpg");
		LargestFloorArea.add(ncgc);
		Building diat3 = new Building("Dubai International Airport Terminal 3", "United Arab Emirates", 1713000,
				"lfa2.jpg");
		LargestFloorArea.add(diat3);
		Building aabe = new Building("Abraj Al-Bait Endowment", "Saudi Arabi", 1575815, "lfa3.jpg");
		LargestFloorArea.add(aabe);
		Building cw = new Building("CentralWorld", "Thailand", 1024000, "lfa4.jpg");
		LargestFloorArea.add(cw);
		Building afa = new Building("Aalsmeer Flower Auction", "Netherlands", 990000, "lfa5.jpg");
		LargestFloorArea.add(afa);
		Building bciat3 = new Building("Bejing Capital International Airport Terminal 3", "China", 986000, "lfa6.jpg");
		LargestFloorArea.add(bciat3);
		Building tvm = new Building("The Venetian Macao", "Macau", 980000, "lfa7.jpg");
		LargestFloorArea.add(tvm);
		Building scc = new Building("Sands Cotai Central", "Macau", 890000, "lfa8.jpg");
		LargestFloorArea.add(scc);
		Building cws = new Building("Ciputra World Surabaya", "Indonesia", 750000, "lfa9.jpg");
		LargestFloorArea.add(cws);
		Building bts = new Building("Berjaya Times Square", "Malaysia", 700000, "lfa10.jpg");
		LargestFloorArea.add(bts);

		return LargestFloorArea;

	}

	public ArrayList<Building> getLargestFootprint() {
		ArrayList<Building> LargestFootprint = new ArrayList<Building>();

		Building afa = new Building("Aalsmeer Flower Auction", "Netherlands", 518000, "fp1.jpg");
		LargestFootprint.add(afa);
		Building md = new Building("Mall of Dubai", "United Arab Emirates", 500000, "fp8.jpg");
		LargestFootprint.add(md);
		Building tf = new Building("Tesla Factory", "United States of America", 427354, "fp2.jpg");
		LargestFootprint.add(tf);
		Building bef = new Building("Beoing Everett Factory", "United States of America", 398000, "fp3.jpg");
		LargestFootprint.add(bef);
		Building mdc = new Building("Michelin Distrubution Center", "United States of America", 371612, "fp4.jpg");
		LargestFootprint.add(mdc);
		Building gmm = new Building("Great Mosque of Mecca", "Saudi Arabi", 356000, "fp5.jpg");
		LargestFootprint.add(gmm);
		Building nike = new Building("Nike", "United States of America", 260000, "fp6.jpg");
		LargestFootprint.add(nike);
		Building jd = new Building("John Deere", "United States of America", 246000, "fp7.jpg");
		LargestFootprint.add(jd);
		Building mmna = new Building("Mitsubishi Motors North America", "United States of America", 220000, "fp9.jpg");
		LargestFootprint.add(mmna);
		Building ice = new Building("Indonesia Convention Exhibition", "Indonesia", 220000, "fp10.jpg");
		LargestFootprint.add(ice);

		return LargestFootprint;
	}

	public ArrayList<Building> getLargestUsableVolume() {
		ArrayList<Building> LargestUsableVolume = new ArrayList<Building>();

		Building bef = new Building("Beoing Everett Factory", "United States of America", 13300000, "uv1.jpg");
		LargestUsableVolume.add(bef);
		Building gmm = new Building("Great Mosque of Mecca", "Saudi Arabi", 8000000, "uv2.jpg");
		LargestUsableVolume.add(gmm);
		Building jllp = new Building("Jean-Luc Lagardere Plant", "France", 5600000, "uv3.jpg");
		LargestUsableVolume.add(jllp);
		Building bcwc = new Building("Boeing Composite Wing Center", "United States of America", 3700000, "uv4.jpg");
		LargestUsableVolume.add(bcwc);
		Building aerium = new Building("Aerium", "Germany", 5200000, "uv5.jpg");
		LargestUsableVolume.add(aerium);
		Building mwd2 = new Building("Meyer Werft Dockhalle 2", "Germany", 4720000, "uv6.jpg");
		LargestUsableVolume.add(mwd2);
		Building nasa = new Building("NASA Vehicle Assembly Building", "United States of America", 3660000, "uv7.jpg");
		LargestUsableVolume.add(nasa);
		Building o2 = new Building("The o2", "England", 2790000, "uv8.jpg");
		LargestUsableVolume.add(o2);
		Building tidc = new Building("Tesco Ireland Distribution Centre", "Ireland", 1550000, "uv9.jpg");
		LargestUsableVolume.add(tidc);
		Building tiw = new Building("Target Import Warehouse", "United States of America", 1500000, "uv10.jpg");
		LargestUsableVolume.add(tiw);

		return LargestUsableVolume;

	}
}
