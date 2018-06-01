package fr.ofii.gda.member.domain;

import com.opengroup.pop.DomainBean;
import com.opengroup.pop.exceptions.DomainException;
import fr.ofii.gda.utils.DomainMethodControlCode;
import fr.ofii.gda.references.domain.DomainCountry;
import fr.ofii.gda.utils.ExtendedDomainBean;
import fr.ofii.gda.utils.ServiceUtil;
import org.springframework.util.StringUtils;


import java.io.Serializable;
import java.util.Date;

/**
 * The type Domain birth.
 */
public class DomainBirth extends ExtendedDomainBean implements Serializable {

    /**
     * The Birth name.
     */
    private String birthName;
    /**
     * The Birth date.
     */
    private Date birthDate;
    /**
     * The Birth place.
     */
    private String birthPlace;
    /**
     * The Native country.
     */
    private DomainCountry nativeCountry;
    /**
     * The Insee country code.
     */
    private DomainCountry inseeCountryCode;

    /**
     * The Nationaly.
     */
    private DomainCountry nationality;

    /**
     * Instantiates a new Domain birth.
     */
    private DomainBirth() {
    }

    /**
     * Instantiates a new Domain birth with params.
     *
     * @param birthName        the birth name
     * @param birthDate        the birth date
     * @param birthPlace       the birth place
     * @param nativeCountry    the native country
     * @param inseeCountryCode the insee country code
     */
    private DomainBirth(String birthName, Date birthDate, String birthPlace, DomainCountry nativeCountry, DomainCountry inseeCountryCode) throws DomainException {
        checkIfValid();
        this.birthName = birthName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.nativeCountry = nativeCountry;
        this.inseeCountryCode = inseeCountryCode;
    }

    private DomainBirth(String birthName, Date birthDate, String birthPlace, DomainCountry nativeCountry, DomainCountry inseeCountryCode, DomainCountry nationality) throws DomainException {
        checkIfValid();
        this.birthName = birthName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.nativeCountry = nativeCountry;
        this.inseeCountryCode = inseeCountryCode;
        this.nationality=nationality;
    }

    /**
     * Instantiates a new Domain birth with params.
     *
     * @param nativeCountry    the native country
     * @param nationality      the nationality
     * @param inseeCountryCode the insee country code
     */

    private DomainBirth(DomainCountry nativeCountry, DomainCountry nationality, DomainCountry inseeCountryCode) throws DomainException {

        //
        checkNotEmpty(inseeCountryCode.getInseeCode(), DomainMethodControlCode.INSEE_PAYS_NATIONALITE);
        checkIfValid();

        //
        this.nationality = nationality;
        this.nativeCountry = nativeCountry;
        this.inseeCountryCode = inseeCountryCode;
    }

    /**
     * From domain birth.
     *
     * @param birthName        the birth name
     * @param birthDate        the birth date
     * @param birthPlace       the birth place
     * @param nativeCountry    the native country
     * @param inseeCountryCode the insee country code
     * @return the domain birth
     */
    public static DomainBirth from(String birthName, Date birthDate, String birthPlace, DomainCountry nativeCountry, DomainCountry inseeCountryCode) throws DomainException{
        return new DomainBirth(birthName, birthDate, birthPlace, nativeCountry, inseeCountryCode);
    }

    public static DomainBirth from(String birthName, Date birthDate, String birthPlace, DomainCountry nativeCountry, DomainCountry inseeCountryCode, DomainCountry nationality) throws DomainException{
        return new DomainBirth(birthName, birthDate, birthPlace, nativeCountry, inseeCountryCode,nationality);
    }

    public static DomainBirth from(DomainCountry nativeCountry, DomainCountry nationality, DomainCountry inseeCountryCode) throws DomainException {
        return new DomainBirth(nativeCountry,nationality,inseeCountryCode);
    }

    public static DomainBirth create() {
        return new DomainBirth();
    }

    public DomainBirth append(String birthName, Date birthDate, String birthPlace, DomainCountry nativeCountry) throws DomainException {
        checkNotEmpty( birthName, DomainMethodControlCode.NOT_FOUND_FILTER );
        checkIfValid();
        this.birthName = birthName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.nativeCountry = nativeCountry;
        return this;
    }

    public DomainBirth assignZ(String name) throws DomainException {
        return this;
    }

    private void toto() {
        try {
            DomainBirth db = DomainBirth.create()
                    .append("truc", null, "truc", null)
                    .assignZ("toto");
        } catch(DomainException de) {

        }


    }

    public DomainBirth update(Long id, String birthName, Date birthDate, String birthPlace, DomainCountry nativeCountry) throws DomainException {
        checkNotEmpty( String.valueOf(id), DomainMethodControlCode.NOT_FOUND_FILTER );
        checkNotEmpty( birthName, DomainMethodControlCode.NOT_FOUND_FILTER );
        checkIfValid();
        this.birthName = birthName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.nativeCountry = nativeCountry;
        return this;
    }

    /**
     * Gets birth name.
     *
     * @return the birth name
     */
    public String getBirthName() {
        return birthName;
    }

    /**
     * Gets birth date.
     *
     * @return the birth date
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Gets birth place.
     *
     * @return the birth place
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Gets native country.
     *
     * @return the native country
     */
    public DomainCountry getNativeCountry() {
        return nativeCountry;
    }

    /**
     * Gets insee country code.
     *
     * @return the insee country code
     */
    public DomainCountry getInseeCountryCode() {
        return inseeCountryCode;
    }


    /**
     * Gets nationality.
     *
     * @return the nationality
     */
    public DomainCountry getNationality() { return nationality; }


    /**
     * Update.
     *
     * @param birthName    the birth name
     * @param birthDate    the birth date
     * @param birthPlace      the birth place
     * @param inseeCountryCode the insee country code
     * @throws DomainException the domain exception
     */
    public void update(String birthName, Date birthDate, String birthPlace, DomainCountry inseeCountryCode) {

        this.birthName = birthName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.inseeCountryCode = inseeCountryCode;
    }

}