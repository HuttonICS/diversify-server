package jhi.diversify.server.pojo;

public class VarietyTraitStats
{
	private Integer traitId;
	private String traitName;
	private Double averageValue;
	private String varieties;

	public Integer getTraitId()
	{
		return traitId;
	}

	public void setTraitId(Integer traitId)
	{
		this.traitId = traitId;
	}

	public String getTraitName()
	{
		return traitName;
	}

	public void setTraitName(String traitName)
	{
		this.traitName = traitName;
	}

	public Double getAverageValue()
	{
		return averageValue;
	}

	public void setAverageValue(Double averageValue)
	{
		this.averageValue = averageValue;
	}

	public String getVarieties()
	{
		return varieties;
	}

	public void setVarieties(String varieties)
	{
		this.varieties = varieties;
	}
}
