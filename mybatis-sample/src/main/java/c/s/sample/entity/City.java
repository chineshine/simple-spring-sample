package c.s.sample.entity;

public class City {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.ID
     *
     * @mbg.generated
     */
    private Integer ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.Name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.CountryCode
     *
     * @mbg.generated
     */
    private String countryCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.District
     *
     * @mbg.generated
     */
    private String district;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.Population
     *
     * @mbg.generated
     */
    private Integer population;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.ID
     *
     * @return the value of city.ID
     *
     * @mbg.generated
     */
    public Integer getID() {
        return ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.ID
     *
     * @param ID the value for city.ID
     *
     * @mbg.generated
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.Name
     *
     * @return the value of city.Name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.Name
     *
     * @param name the value for city.Name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.CountryCode
     *
     * @return the value of city.CountryCode
     *
     * @mbg.generated
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.CountryCode
     *
     * @param countryCode the value for city.CountryCode
     *
     * @mbg.generated
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.District
     *
     * @return the value of city.District
     *
     * @mbg.generated
     */
    public String getDistrict() {
        return district;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.District
     *
     * @param district the value for city.District
     *
     * @mbg.generated
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.Population
     *
     * @return the value of city.Population
     *
     * @mbg.generated
     */
    public Integer getPopulation() {
        return population;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.Population
     *
     * @param population the value for city.Population
     *
     * @mbg.generated
     */
    public void setPopulation(Integer population) {
        this.population = population;
    }
}