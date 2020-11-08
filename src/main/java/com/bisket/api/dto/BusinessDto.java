package com.bisket.api.dto;

import com.bisket.api.common.BusinessCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class BusinessDto {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BusinessListPageGetRequestDto {
        // 요청 페이지 정보
        private PaginationDto.PaginationRequestDto requestPagination = new PaginationDto.PaginationRequestDto();
        // 소재지 주소
        private String siteAddress;
        // 도로명 주소
        private String roadNameAddress;
        // 사업장명
        private String businessPlaceName;
        // 업체 카테고리 리스트
        private List<BusinessCategory> businessCategoryList;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BusinessListPageGetResponseDto {
        private Long id;
        private String businessPlaceName;
        private String sitePhoneNumber;
        private String siteFullAddress;
        private String roadNamePostCode;
        private BusinessCategory discriminatorType;
    }

    @Data
    @NoArgsConstructor
    public static class BusinessGetResponseDto {
        private String openServiceName;
        private String openServiceId;
        private String openAutonomousBodyCode;
        private String managementCode;
        private String licensingDate;
        private String licensingCancelDate;
        private String businessStatusCode;
        private String businessStatusName;
        private String detailedBusinessStatusCode;
        private String detailedBusinessStatusName;
        private String closeDate;
        private String idleStartDate;
        private String idleEndDate;
        private String reopenDate;
        private String sitePhoneNumber;
        private String siteArea;
        private String sitePostCode;
        private String siteFullAddress;
        private String roadNamePostCode;
        private String roadNameFullAddress;
        private String businessPlaceName;
        private String lastModificationTime;
        private String dataUpdateClassification;
        private String dataUpdateDate;
        private String businessTypeClassificationName;
        private String xCoordinate;
        private String yCoordinate;

        // 병원
        private String medicalOrganizationClassificationName;
        private String medicalPersonnelCount;
        private String hospitalRoomCount;
        private String sickbedCount;
        private String totalArea;
        private String treatmentSubjectContent;
        private String treatmentSubjectContentName;
        private String appointmentCancelDate;
        private String palliativeMedicineAppointmentType;
        private String palliativeMedicineDepartmentName;
        private String specialAmbulanceCount;
        private String generalAmbulanceCount;
        private String employeeCount;
        private String paramedicCount;
        private String approvedSickbedCount;
        private String firstAppointmentDate;

        // 산후조리업
        private String pregnantWomanCapacity;
        private String babyCapacity;
        private String pregnantWomanRoomArea;
        private String babyRoomArea;
        private String nursingRoomArea;
        private String foodServiceFacilityArea;
        private String laundryRoomArea;
        private String bathRoomArea;
        private String careCenterRestRoomArea;
        private String officeArea;
        private String nurseCount;
        private String nurseAidCount;
        private String nutritionistCount;
        private String cookingPersonnelCount;
        private String cleaningPersonnelCount;
        private String otherStaffCount;
        private String buildingFloorCount;
        private String groundFloorCount;
        private String basementFloorCount;

        // 안전상비의약품판매업소
        private String storeBusinessArea;

        // 약국
        private String businessArea;
        private String appointmentDate;

        // 의료유사업
        private String licenseHolderCount;
        private String assistantEmployeeCount;
        private String facilityManagerCount;
        private String otherEmployeeCount;

        // 안경업
        private String eyesightChartCount;
        private String sampleLensCount;
        private String measurementChairCount;
        private String pupillostatometerCount;
        private String vertexRefractometerCount;
        private String preparativeGrinderCount;
        private String lensCutterCount;
        private String heaterCount;
        private String glassesWasherCount;

        // 의료기기수리업
        private String repairTargetMedicalDeviceType;
        private String sidejobFlag;
        private String totalScale;
        private String businessScale;

        // 치과기공소
        private String laboratoryLatheCount;
        private String centrifugalCastingMachineCount;
        private String laboratoryMotorCount;
        private String acetyleneCount;
        private String dentalPressCount;
        private String electricFurnaceCount;
        private String porcelainFurnaceCount;
        private String ultrasonicCleanerCount;
        private String surveyorCount;
        private String vibratorCount;
        private String trimmerCount;
        private String laboratoryCompressorCount;
        private String sanderCount;
        private String vacuumMixerCount;
        private String pindexCount;

        // 축산운반업
        private String livestockJobClassificationName;
        private String livestockProductProcessingBusinessClassificationName;
        private String livestockSerialNumber;
        private String rightSubjectSerialNumber;

        // 가축사육업
        private String mainFarmingBusinessLine;

        // 게임물배급업
        private String cultureSportsBusinessLineName;
        private String culturalBusinessOperatorClassificationName;
        private String environmentName;
        private String productionHandlingItemContent;
        private String facilityArea;
        private String buildingUseName;
        private String passageBreadth;
        private String lightingFacilityIlluminance;
        private String singingRoomCount;
        private String teenagerRoomCount;
        private String emergencyStairsFlag;
        private String emergencyExitFlag;
        private String autoVentilationFlag;
        private String teenagerRoomFlag;
        private String specialLightingFlag;
        private String soundIsolationFacilityFlag;
        private String vcrName;
        private String lightingFacilityFlag;
        private String soundFacilityFlag;
        private String convenienceFacilityFlag;
        private String fireProtectionFacilityFlag;
        private String gameDeviceCount;
        private String otherBusinessLineName;
        private String gameRating;
        private String stageFormClassificationName;
        private String itemName;
        private String firstRegistrationTime;
        private String regionClassificationName;

        // 관광궤도업
        private String guestRoomCount;
        private String annualBuildingArea;
        private String businessEnglishName;
        private String businessEnglishAddress;
        private String shipTonnage;
        private String shipCount;
        private String shipInformation;
        private String stageArea;
        private String seatingCapacity;
        private String souvenirKind;
        private String meetingRoomSeatingCapacity;
        private String rideCountDetails;
        private String amusementFacilityCount;
        private String broadcastingFacilityFlag;
        private String powerProductionFacilityFlag;
        private String medicalOfficeFlag;
        private String informationDeskFlag;
        private String plannedTravelInsuranceStartDate;
        private String plannedTravelInsuranceEndDate;
        private String capital;
        private String insuranceStartDate;
        private String insuranceEndDate;
        private String additionalFacilityDetails;
        private String facilityScale;

        // 관광숙박업
        private String tourAccommodationBusinessDetailedName;

        // 옥외광고업
        private String businessContent;

        // 휴게음식점
        private String sanitationBusinessTypeName;
        private String maleWorkerCount;
        private String femaleWorkerCount;
        private String businessPlaceEnvironmentClassificationName;
        private String gradeClassificationName;
        private String waterSupplyFacilityClassificationName;
        private String headOfficeEmployeeCount;
        private String factoryOfficeEmployeeCount;
        private String factorySaleEmployeeCount;
        private String factoryProductionEmployeeCount;
        private String buildingPossessionClassificationName;
        private String deposit;
        private String monthlyRent;
        private String publiclyUsedBusinessPlaceFlag;
        private String traditionalBusinessPlaceAppointmentNumber;
        private String traditionalBusinessPlaceMainFood;
        private String homepage;

        // 등록체육시설업
        private String publicPrivateClassificationName;
        private String insuranceFlag;
        private String instructorCount;
        private String buildingDongCount;
        private String memberRecruitmentCapacity;
        private String detailedBusinessLineName;
        private String corporationName;

        // 수질오염원설치시설기타
        private String environmentalJobClassificationName;
        private String businessLineClassificationName;
        private String classificationName;
        private String mainProductName;
        private String dischargeFacilityOperatingHours;
        private String annualDischargeFacilityOperatingDays;
        private String preventionFacilityOperatingHours;
        private String annualPreventionFacilityOperatingDays;

        // 이용업
        private String useStartGroundFloor;
        private String useEndGroundFloor;
        private String useStartBasementFloor;
        private String useEndBasementFloor;
        private String koreanStyleRoomCount;
        private String westernStyleRoomCount;
        private String bathRoomCount;
        private String sweatingRoomFlag;
        private String conditionalApprovalRegistrationReason;
        private String conditionalApprovalStartDate;
        private String conditionalApprovalEndDate;
        private String washingMachineCount;
        private String recoveringDryerCount;
        private String bedCount;

        // 환경컨설팅회사
        private String laboratoryArea;
        private String businessPlaceClassificationName;
        private String businessPlaceArea;
        private String consignmentBusinessName;
        private String laboratoryRegionCode;
        private String laboratoryPostCode;
        private String laboratoryAddressSan;
        private String laboratoryAddressBeonji;
        private String laboratoryAddressHo;
        private String laboratoryAddressTong;
        private String laboratoryAddressBan;
        private String laboratorySpecialAddress;
        private String laboratorySpecialAddressDong;
        private String laboratorySpecialAddressHo;
        private String laboratoryRoadNameAddressSiGunGuCode;
        private String laboratoryRoadNameAddressEupMyeonDongCode;
        private String laboratoryRoadNameAddressEupMyeonDongClassification;
        private String laboratoryRoadNameAddressCode;
        private String laboratoryRoadNameSpecialAddress;
        private String laboratoryRoadNameAddressBuildingFloorClassification;
        private String laboratoryRoadNameAddressBuildingOriginalNumber;
        private String laboratoryRoadNameAddressBuildingSubNumber;
        private String laboratoryRoadNameAddressPostCode;

        // 제재업
        private String timberProductionBusinessClassificationCode;
        private String timberProductionBusinessKindName;
        private String handlingTimberProduct;
        private String manpowerPossessionStatus;
        private String annualProduction;
        private String statusClassificationName;

        // 계량기제조업
        private String officePhoneNumber;
        private String businessPlacePhoneNumber;

        // 고업가스업
        private String manufacturingClassificationName;
        private String businessPlaceSiteUseClassificationName;

        // 석연탄제조업
        private String coalYardArea;
        private String railwayIndustrialLineFlag;
        private String businessOpenScheduleDate;
        private String rotaryPressProductionFacility;

        // 석유판매업
        private String customer;

        // 액화석유가스용품제조업체
        private String storageFacilityLocation;
        private String containerStoreroomArea;
        private String garageArea;
        private String plumbingInstallationPlace;
        private String lengthChangeContent;
        private String handlingGasCapacity;
        private String gasApplianceKindName;
        private String facilityName;
        private String itemStandard;
        private String exemptionRange;

        // 일반도시가스업체
        private String plumbingLength;
        private String supplyRuleContent;
        private String gasKindName;

        // 상조업
        private String civilComplaintKindName;
        private String capitalScale;
        private String depositOrganizationName;
        private String mutualAidContractName;
        private String otherMutualAidContractName;
        private String insurance;
        private String debtPaymentGuarantee;

        // 전력기술설계업체
        private String designSupervisionBusinessKindName;
        private String countryName;
        private String realCapital;

        // 특정고압가스업
        private String usePurpose;
        private String useMethod;
        private String monthlyUsage;
        private String capacity;
        private String facilityUseFlag;

        // 지하수시공업체
        private String specialistCount;
        private String facilityEquipment;
        private String otherOrganizationTransferFlag;

        // 전통사찰
        private String buddhistMonkCount;
        private String believerCount;
        private String establishmentEra;
        private String originHistory;
        private String appointmentCancel;
        private String appointmentCancelReason;
        private String traditionalTempleName;

        // 용기냉동기특정설비
        private String facilityStandard;

        // 급수공사대행업
        private String approvalStartDate;
        private String approvalEndDate;

        // 소독업
        private String disinfectionVehicleGarageArea;
        private String ultrafineParticleSpreaderCount;
        private String portableDisinfectorCount;
        private String powerSprayerCount;
        private String handSprayerCount;
        private String gasMaskCount;
        private String protectiveGlassesCount;
        private String protectiveClothingCount;
        private String vacuumCleanerCount;

        // 대규모점포
        private String storeClassificationName;

        // 쓰레기종량제봉투판매업
        private String site;
        private String applicationDate;
        private String itemValue1;

        // 저수조청소업
        private String jobClassification;
        private String buildingName;
        private String buildingStatusName;
        private String cleaningTargetStartDate;
        private String cleaningTargetEndDate;
        private String idleCloseReason;
        private String jobClassificationName;

        // 건설폐기물처리업
        private String wasteTreatmentBusinessClassificationName;
        private String wasteTreatmentClassificationName;
        private String wasteClassificationName;
        private String allowedStorageQuantity;
        private String allowedStorageQuantityContent;

        // 문화예술법인
        private String completionDate;
        private String hallOpenDate;
        private String managementSubjectClassificationName;
        private String museumArtGalleryKindName;
        private String museumArtGalleryTypeName;
        private String hallCloseDate;
        private String hallCloseReason;
        private String capitalNeeds;
        private String corporationEstablishmentPurpose;
        private String approvalCondition;
        private String disincorporationDate;

        // 담배수입판매업체
        private String handlingProductName;
        private String tobaccoSupplierName;

        // 물류주선업국제
        private String autonomousBodyCode;
        private String businessTypeName;
        private String appointedMaintenanceBusinessLineName;
        private String licenseDate;
        private String licenseValidityTermStartDate;
        private String licenseValidityTermEndDate;
        private String licenseIssuingOrganization;

        // 물류창고업체
        private String generalWarehouseDongCount;
        private String generalWarehouseArea;
        private String refrigeratorFreezerDongCount;
        private String refrigeratorFreezerArea;
        private String storagePlaceArea;
        private String facilityEquipmentStatus;
        private String storageRate;
        private String corporationFlagName;
        private String businessTypeStorageWarehouse;
        private String businessTypeTransportCourier;
        private String businessTypeSale;
        private String businessTypeManufacturing;

        // 민방위급수시설
        private String emergencyFacilityLocation;
        private String facilityClassificationName;
        private String facilityNameBuildingName;

        // 승강기제조및수입업체
        private String managementBusinessClassificationName;
        private String assets;
        private String maintenanceRange;
        private String maintenanceManCount;
        private String practicalTechnicianCount;
        private String designTechnicianCount;
        private String manufacturingTechnicianCount;
        private String officialCount;
        private String staffCount;
        private String technicalPostStaffCount;
        private String skillPostStaffCount;
        private String officeStaffCount;
        private String companyClassificationName;

        // 장례지도사교육기관
        private String possessionLicenseName;
        private String governmentExpenditureSupportFlag;
        private String responsibleStaffContent;
        private String deleteDate;

        // 유료직업소개소
        private String corporationClassificationName;

        // 행정사업
        private String registrationDate;
        private String changeTurn;
        private String changeDate;
        private String administrativeAgentKind;

        // 방문판매업
        private String assetsScale;
        private String debtAmount;
        private String saleMethodName;
    }
}