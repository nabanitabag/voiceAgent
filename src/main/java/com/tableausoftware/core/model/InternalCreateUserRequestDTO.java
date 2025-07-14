package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import com.tableausoftware.core.model.BulkOpAttributes;
import com.tableausoftware.core.model.InternalUserSiteRoleDTO;
import com.tableausoftware.core.model.UserLinkRoleDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * InternalCreateUserRequestDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class InternalCreateUserRequestDTO {

  private BulkOpAttributes bulkOpAttributes;

  private String email;

  /**
   * Language of the user.
   */
  public enum LanguageEnum {
    DE_DE("DE_DE"),
    
    EN_GB("EN_GB"),
    
    EN_US("EN_US"),
    
    ES_ES("ES_ES"),
    
    FR_CA("FR_CA"),
    
    FR_FR("FR_FR"),
    
    IT_IT("IT_IT"),
    
    NL_NL("NL_NL"),
    
    JA_JP("JA_JP"),
    
    KO_KR("KO_KR"),
    
    PT_BR("PT_BR"),
    
    SV_SE("SV_SE"),
    
    TH_TH("TH_TH"),
    
    ZH_CN("ZH_CN"),
    
    ZH_TW("ZH_TW");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LanguageEnum fromValue(String value) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LanguageEnum language;

  @Valid
  private List<@Valid UserLinkRoleDTO> linkRoles;

  /**
   * Locale of the user.
   */
  public enum LocaleEnum {
    AR_AE("ar_AE"),
    
    AR_BH("ar_BH"),
    
    AR_DZ("ar_DZ"),
    
    AR_EG("ar_EG"),
    
    AR_IQ("ar_IQ"),
    
    AR_JO("ar_JO"),
    
    AR_KW("ar_KW"),
    
    AR_LB("ar_LB"),
    
    AR_LY("ar_LY"),
    
    AR_MA("ar_MA"),
    
    AR_OM("ar_OM"),
    
    AR_QA("ar_QA"),
    
    AR_SA("ar_SA"),
    
    AR_SD("ar_SD"),
    
    AR_SY("ar_SY"),
    
    AR_TN("ar_TN"),
    
    AR_YE("ar_YE"),
    
    BE_BY("be_BY"),
    
    BG_BG("bg_BG"),
    
    CA_ES("ca_ES"),
    
    CS_CZ("cs_CZ"),
    
    DA_DK("da_DK"),
    
    DE_AT("de_AT"),
    
    DE_CH("de_CH"),
    
    DE_DE("de_DE"),
    
    DE_LU("de_LU"),
    
    EL_CY("el_CY"),
    
    EL_GR("el_GR"),
    
    EN_AU("en_AU"),
    
    EN_CA("en_CA"),
    
    EN_GB("en_GB"),
    
    EN_IE("en_IE"),
    
    EN_IN("en_IN"),
    
    EN_MT("en_MT"),
    
    EN_NZ("en_NZ"),
    
    EN_PH("en_PH"),
    
    EN_SG("en_SG"),
    
    EN_US("en_US"),
    
    EN_ZA("en_ZA"),
    
    ES_AR("es_AR"),
    
    ES_BO("es_BO"),
    
    ES_CL("es_CL"),
    
    ES_CO("es_CO"),
    
    ES_CR("es_CR"),
    
    ES_DO("es_DO"),
    
    ES_EC("es_EC"),
    
    ES_ES("es_ES"),
    
    ES_GT("es_GT"),
    
    ES_HN("es_HN"),
    
    ES_MX("es_MX"),
    
    ES_NI("es_NI"),
    
    ES_PA("es_PA"),
    
    ES_PE("es_PE"),
    
    ES_PR("es_PR"),
    
    ES_PY("es_PY"),
    
    ES_SV("es_SV"),
    
    ES_US("es_US"),
    
    ES_UY("es_UY"),
    
    ES_VE("es_VE"),
    
    ET_EE("et_EE"),
    
    FI_FI("fi_FI"),
    
    FR_BE("fr_BE"),
    
    FR_CA("fr_CA"),
    
    FR_CH("fr_CH"),
    
    FR_FR("fr_FR"),
    
    FR_LU("fr_LU"),
    
    HI_IN("hi_IN"),
    
    HR_HR("hr_HR"),
    
    HU_HU("hu_HU"),
    
    IN_ID("in_ID"),
    
    IS_IS("is_IS"),
    
    IT_CH("it_CH"),
    
    IT_IT("it_IT"),
    
    IW_IL("iw_IL"),
    
    JA_JP("ja_JP"),
    
    KO_KR("ko_KR"),
    
    LT_LT("lt_LT"),
    
    LV_LV("lv_LV"),
    
    MK_MK("mk_MK"),
    
    MS_MY("ms_MY"),
    
    MT_MT("mt_MT"),
    
    NL_BE("nl_BE"),
    
    NL_NL("nl_NL"),
    
    NO_NO("no_NO"),
    
    PL_PL("pl_PL"),
    
    PT_BR("pt_BR"),
    
    PT_PT("pt_PT"),
    
    RO_RO("ro_RO"),
    
    RU_RU("ru_RU"),
    
    SK_SK("sk_SK"),
    
    SL_SI("sl_SI"),
    
    SQ_AL("sq_AL"),
    
    SR_BA("sr_BA"),
    
    SR_ME("sr_ME"),
    
    SR_RS("sr_RS"),
    
    SV_SE("sv_SE"),
    
    TH_TH("th_TH"),
    
    TR_TR("tr_TR"),
    
    UK_UA("uk_UA"),
    
    VI_VN("vi_VN"),
    
    ZH_CN("zh_CN"),
    
    ZH_HK("zh_HK"),
    
    ZH_SG("zh_SG"),
    
    ZH_TW("zh_TW");

    private String value;

    LocaleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LocaleEnum fromValue(String value) {
      for (LocaleEnum b : LocaleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LocaleEnum locale;

  @Valid
  private List<@Valid InternalUserSiteRoleDTO> siteRoles;

  private String userName;

  /**
   * Default constructor
   * @deprecated Use {@link InternalCreateUserRequestDTO#InternalCreateUserRequestDTO(String)}
   */
  @Deprecated
  public InternalCreateUserRequestDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InternalCreateUserRequestDTO(String userName) {
    this.userName = userName;
  }

  public InternalCreateUserRequestDTO bulkOpAttributes(BulkOpAttributes bulkOpAttributes) {
    this.bulkOpAttributes = bulkOpAttributes;
    return this;
  }

  /**
   * Get bulkOpAttributes
   * @return bulkOpAttributes
  */
  @Valid 
  @Schema(name = "bulkOpAttributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bulkOpAttributes")
  public BulkOpAttributes getBulkOpAttributes() {
    return bulkOpAttributes;
  }

  public void setBulkOpAttributes(BulkOpAttributes bulkOpAttributes) {
    this.bulkOpAttributes = bulkOpAttributes;
  }

  public InternalCreateUserRequestDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email id of the user.
   * @return email
  */
  
  @Schema(name = "email", description = "Email id of the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InternalCreateUserRequestDTO language(LanguageEnum language) {
    this.language = language;
    return this;
  }

  /**
   * Language of the user.
   * @return language
  */
  
  @Schema(name = "language", description = "Language of the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  public InternalCreateUserRequestDTO linkRoles(List<@Valid UserLinkRoleDTO> linkRoles) {
    this.linkRoles = linkRoles;
    return this;
  }

  public InternalCreateUserRequestDTO addLinkRolesItem(UserLinkRoleDTO linkRolesItem) {
    if (this.linkRoles == null) {
      this.linkRoles = new ArrayList<>();
    }
    this.linkRoles.add(linkRolesItem);
    return this;
  }

  /**
   * Link role of the user to be created
   * @return linkRoles
  */
  @Valid 
  @Schema(name = "linkRoles", description = "Link role of the user to be created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkRoles")
  public List<@Valid UserLinkRoleDTO> getLinkRoles() {
    return linkRoles;
  }

  public void setLinkRoles(List<@Valid UserLinkRoleDTO> linkRoles) {
    this.linkRoles = linkRoles;
  }

  public InternalCreateUserRequestDTO locale(LocaleEnum locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Locale of the user.
   * @return locale
  */
  
  @Schema(name = "locale", description = "Locale of the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locale")
  public LocaleEnum getLocale() {
    return locale;
  }

  public void setLocale(LocaleEnum locale) {
    this.locale = locale;
  }

  public InternalCreateUserRequestDTO siteRoles(List<@Valid InternalUserSiteRoleDTO> siteRoles) {
    this.siteRoles = siteRoles;
    return this;
  }

  public InternalCreateUserRequestDTO addSiteRolesItem(InternalUserSiteRoleDTO siteRolesItem) {
    if (this.siteRoles == null) {
      this.siteRoles = new ArrayList<>();
    }
    this.siteRoles.add(siteRolesItem);
    return this;
  }

  /**
   * Site role of the user
   * @return siteRoles
  */
  @Valid 
  @Schema(name = "siteRoles", description = "Site role of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("siteRoles")
  public List<@Valid InternalUserSiteRoleDTO> getSiteRoles() {
    return siteRoles;
  }

  public void setSiteRoles(List<@Valid InternalUserSiteRoleDTO> siteRoles) {
    this.siteRoles = siteRoles;
  }

  public InternalCreateUserRequestDTO userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Unique username of the user.
   * @return userName
  */
  @NotNull 
  @Schema(name = "userName", description = "Unique username of the user.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalCreateUserRequestDTO internalCreateUserRequestDTO = (InternalCreateUserRequestDTO) o;
    return Objects.equals(this.bulkOpAttributes, internalCreateUserRequestDTO.bulkOpAttributes) &&
        Objects.equals(this.email, internalCreateUserRequestDTO.email) &&
        Objects.equals(this.language, internalCreateUserRequestDTO.language) &&
        Objects.equals(this.linkRoles, internalCreateUserRequestDTO.linkRoles) &&
        Objects.equals(this.locale, internalCreateUserRequestDTO.locale) &&
        Objects.equals(this.siteRoles, internalCreateUserRequestDTO.siteRoles) &&
        Objects.equals(this.userName, internalCreateUserRequestDTO.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkOpAttributes, email, language, linkRoles, locale, siteRoles, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalCreateUserRequestDTO {\n");
    sb.append("    bulkOpAttributes: ").append(toIndentedString(bulkOpAttributes)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkRoles: ").append(toIndentedString(linkRoles)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    siteRoles: ").append(toIndentedString(siteRoles)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

