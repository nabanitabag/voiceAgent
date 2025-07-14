package com.tableausoftware.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import com.tableausoftware.core.model.GetUserLinkRoleResponseDTO;
import com.tableausoftware.core.model.GetUserSiteRoleResponseDTO;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * hydrated user object
 */

@Schema(name = "UserDTO", description = "hydrated user object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-17T20:34:40.295130+05:30[Asia/Kolkata]")
public class UserDTO {

  private String displayName;

  private String email;

  /**
   * language of the user
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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastLoginTime;

  @Valid
  private List<@Valid GetUserLinkRoleResponseDTO> linkRoles;

  /**
   * locale of the user
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

  /**
   * Max site role of the user
   */
  public enum MaxSiteRoleEnum {
    SITEADMINISTRATOREXPLORER("SiteAdministratorExplorer"),
    
    SUPPORTUSER("SupportUser"),
    
    EXPLORERCANPUBLISH("ExplorerCanPublish"),
    
    EXPLORER("Explorer"),
    
    UNLICENSED("Unlicensed"),
    
    VIEWER("Viewer"),
    
    CREATOR("Creator"),
    
    SITEADMINISTRATORCREATOR("SiteAdministratorCreator");

    private String value;

    MaxSiteRoleEnum(String value) {
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
    public static MaxSiteRoleEnum fromValue(String value) {
      for (MaxSiteRoleEnum b : MaxSiteRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MaxSiteRoleEnum maxSiteRole;

  private Integer numberOfSiteRoles;

  @Valid
  private List<@Valid GetUserSiteRoleResponseDTO> siteRoles;

  private String tcmRoleName;

  private UUID tenantId;

  private UUID userId;

  private String userName;

  /**
   * Status of the user for e.g. ACTIVE
   */
  public enum UserStatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE"),
    
    SYNC_PENDING("SYNC_PENDING"),
    
    SYNC_IN_PROGRESS("SYNC_IN_PROGRESS"),
    
    CREATE_FAILED("CREATE_FAILED");

    private String value;

    UserStatusEnum(String value) {
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
    public static UserStatusEnum fromValue(String value) {
      for (UserStatusEnum b : UserStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private UserStatusEnum userStatus;

  public UserDTO displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Display name of the user
   * @return displayName
  */
  
  @Schema(name = "displayName", description = "Display name of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email ID of the user
   * @return email
  */
  
  @Schema(name = "email", description = "Email ID of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserDTO language(LanguageEnum language) {
    this.language = language;
    return this;
  }

  /**
   * language of the user
   * @return language
  */
  
  @Schema(name = "language", description = "language of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  public UserDTO lastLoginTime(OffsetDateTime lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
    return this;
  }

  /**
   * last logged in time of the user
   * @return lastLoginTime
  */
  @Valid 
  @Schema(name = "lastLoginTime", description = "last logged in time of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastLoginTime")
  public OffsetDateTime getLastLoginTime() {
    return lastLoginTime;
  }

  public void setLastLoginTime(OffsetDateTime lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }

  public UserDTO linkRoles(List<@Valid GetUserLinkRoleResponseDTO> linkRoles) {
    this.linkRoles = linkRoles;
    return this;
  }

  public UserDTO addLinkRolesItem(GetUserLinkRoleResponseDTO linkRolesItem) {
    if (this.linkRoles == null) {
      this.linkRoles = new ArrayList<>();
    }
    this.linkRoles.add(linkRolesItem);
    return this;
  }

  /**
   * Link roles of the user
   * @return linkRoles
  */
  @Valid 
  @Schema(name = "linkRoles", description = "Link roles of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkRoles")
  public List<@Valid GetUserLinkRoleResponseDTO> getLinkRoles() {
    return linkRoles;
  }

  public void setLinkRoles(List<@Valid GetUserLinkRoleResponseDTO> linkRoles) {
    this.linkRoles = linkRoles;
  }

  public UserDTO locale(LocaleEnum locale) {
    this.locale = locale;
    return this;
  }

  /**
   * locale of the user
   * @return locale
  */
  
  @Schema(name = "locale", description = "locale of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locale")
  public LocaleEnum getLocale() {
    return locale;
  }

  public void setLocale(LocaleEnum locale) {
    this.locale = locale;
  }

  public UserDTO maxSiteRole(MaxSiteRoleEnum maxSiteRole) {
    this.maxSiteRole = maxSiteRole;
    return this;
  }

  /**
   * Max site role of the user
   * @return maxSiteRole
  */
  
  @Schema(name = "maxSiteRole", description = "Max site role of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxSiteRole")
  public MaxSiteRoleEnum getMaxSiteRole() {
    return maxSiteRole;
  }

  public void setMaxSiteRole(MaxSiteRoleEnum maxSiteRole) {
    this.maxSiteRole = maxSiteRole;
  }

  public UserDTO numberOfSiteRoles(Integer numberOfSiteRoles) {
    this.numberOfSiteRoles = numberOfSiteRoles;
    return this;
  }

  /**
   * Number of SiteRoles of the user
   * @return numberOfSiteRoles
  */
  
  @Schema(name = "numberOfSiteRoles", description = "Number of SiteRoles of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfSiteRoles")
  public Integer getNumberOfSiteRoles() {
    return numberOfSiteRoles;
  }

  public void setNumberOfSiteRoles(Integer numberOfSiteRoles) {
    this.numberOfSiteRoles = numberOfSiteRoles;
  }

  public UserDTO siteRoles(List<@Valid GetUserSiteRoleResponseDTO> siteRoles) {
    this.siteRoles = siteRoles;
    return this;
  }

  public UserDTO addSiteRolesItem(GetUserSiteRoleResponseDTO siteRolesItem) {
    if (this.siteRoles == null) {
      this.siteRoles = new ArrayList<>();
    }
    this.siteRoles.add(siteRolesItem);
    return this;
  }

  /**
   * Site roles of the user
   * @return siteRoles
  */
  @Valid 
  @Schema(name = "siteRoles", description = "Site roles of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("siteRoles")
  public List<@Valid GetUserSiteRoleResponseDTO> getSiteRoles() {
    return siteRoles;
  }

  public void setSiteRoles(List<@Valid GetUserSiteRoleResponseDTO> siteRoles) {
    this.siteRoles = siteRoles;
  }

  public UserDTO tcmRoleName(String tcmRoleName) {
    this.tcmRoleName = tcmRoleName;
    return this;
  }

  /**
   * Name of link role of the user
   * @return tcmRoleName
  */
  
  @Schema(name = "tcmRoleName", description = "Name of link role of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tcmRoleName")
  public String getTcmRoleName() {
    return tcmRoleName;
  }

  public void setTcmRoleName(String tcmRoleName) {
    this.tcmRoleName = tcmRoleName;
  }

  public UserDTO tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Unique ID of the tenant
   * @return tenantId
  */
  @Valid 
  @Schema(name = "tenantId", description = "Unique ID of the tenant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  public UserDTO userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Unique ID of the user as configured in User Service
   * @return userId
  */
  @Valid 
  @Schema(name = "userId", description = "Unique ID of the user as configured in User Service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public UserDTO userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * UserName of the user
   * @return userName
  */
  
  @Schema(name = "userName", description = "UserName of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserDTO userStatus(UserStatusEnum userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * Status of the user for e.g. ACTIVE
   * @return userStatus
  */
  
  @Schema(name = "userStatus", description = "Status of the user for e.g. ACTIVE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userStatus")
  public UserStatusEnum getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(UserStatusEnum userStatus) {
    this.userStatus = userStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDTO userDTO = (UserDTO) o;
    return Objects.equals(this.displayName, userDTO.displayName) &&
        Objects.equals(this.email, userDTO.email) &&
        Objects.equals(this.language, userDTO.language) &&
        Objects.equals(this.lastLoginTime, userDTO.lastLoginTime) &&
        Objects.equals(this.linkRoles, userDTO.linkRoles) &&
        Objects.equals(this.locale, userDTO.locale) &&
        Objects.equals(this.maxSiteRole, userDTO.maxSiteRole) &&
        Objects.equals(this.numberOfSiteRoles, userDTO.numberOfSiteRoles) &&
        Objects.equals(this.siteRoles, userDTO.siteRoles) &&
        Objects.equals(this.tcmRoleName, userDTO.tcmRoleName) &&
        Objects.equals(this.tenantId, userDTO.tenantId) &&
        Objects.equals(this.userId, userDTO.userId) &&
        Objects.equals(this.userName, userDTO.userName) &&
        Objects.equals(this.userStatus, userDTO.userStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, email, language, lastLoginTime, linkRoles, locale, maxSiteRole, numberOfSiteRoles, siteRoles, tcmRoleName, tenantId, userId, userName, userStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDTO {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastLoginTime: ").append(toIndentedString(lastLoginTime)).append("\n");
    sb.append("    linkRoles: ").append(toIndentedString(linkRoles)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    maxSiteRole: ").append(toIndentedString(maxSiteRole)).append("\n");
    sb.append("    numberOfSiteRoles: ").append(toIndentedString(numberOfSiteRoles)).append("\n");
    sb.append("    siteRoles: ").append(toIndentedString(siteRoles)).append("\n");
    sb.append("    tcmRoleName: ").append(toIndentedString(tcmRoleName)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
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

