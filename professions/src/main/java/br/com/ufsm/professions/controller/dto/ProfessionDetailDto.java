package br.com.ufsm.professions.controller.dto;

import br.com.ufsm.professions.model.SectorProfession;
import br.com.ufsm.professions.model.Profession;

public class ProfessionDetailDto {
	
	private Long idProfession;
	private String name;
	private String area;
	private SectorProfession sector;
	private String title;
	
	public ProfessionDetailDto (Profession profession) {
		this.idProfession = profession.getIdProfession();
		this.name = profession.getName();
		this.area = profession.getArea();
		this.sector = profession.getSector();
		this.title = new TitleDto(profession.getTitle()).getName();
	}

	public Long getIdProfession() {
		return idProfession;
	}

	public void setIdProfession(Long idProfession) {
		this.idProfession = idProfession;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public SectorProfession getSector() {
		return sector;
	}

	public void setSector(SectorProfession sector) {
		this.sector = sector;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
