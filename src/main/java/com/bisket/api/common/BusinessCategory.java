package com.bisket.api.common;

public enum BusinessCategory {
    HOSPITAL("병원"),
    CLINIC("의원"),
    MEDICAL_CORPORATION("의료법인"),
    EMERGENCY_PATIENT_TRANSFER("응급환자이송업"),
    AFFILIATED_MEDICAL_ORGANIZATION("부속의료기관"),
    SAFETY_OFFICINAL_SALE("안전상비의약품판매업소"),
    POSTPARTUM_CARE("산후조리업"),
    PHARMACY("약국"),
    PARAMEDICAL_SERVICE("의료유사업"),
    GLASSES("안경업"),
    MEDICAL_ORGANIZATION_LAUNDRY_TREATMENT("의료기관세탁물처리업"),
    MEDICAL_DEVICE_SALE_LEASE("의료기기판매임대업"),
    MEDICAL_DEVICE_REPAIR("의료기기수리업"),
    DENTAL_LABORATORY("치과기공소"),
    ANIMAL_HOSPITAL("동물병원"),
    ANIMAL_PHARMACY("동물약국"),
    SLAUGHTER("도축업"),
    INCUBATION("부화업"),
    ANIMAL_MEDICAL_EQUIPMENT_SALE("동물용의료용구판매업"),
    FEED_MANUFACTURING("사료제조업"),
    LIVESTOCK_ARTIFICIAL_INSEMINATION_CENTER("가축인공수정소"),
    ANIMAL_FUNERAL("동물장묘업"),
    ANIMAL_SALE("동물판매업"),
    BREEDING_STOCK("종축업"),
    MILK_COLLECTION("집유업"),
    LIVESTOCK_PRODUCT_TRANSPORT("축산물운반업"),
    LIVESTOCK_PRODUCT_STORAGE("축산물보관업"),
    LIVESTOCK_SALE("축산판매업"),
    LIVESTOCK_PROCESSING("축산가공업"),
    ANIMAL_MEDICINE_WHOLESALE_STORE("동물용의약품도매상"),
    MEAT_PACKAGING("식육포장처리업"),
    LIVESTOCK_FARMING("가축사육업"),
    COMPOSITE_VIDEO_SERVICE("복합영상물제공업"),
    GAME_DISTRIBUTION("게임물배급업"),
    GAME_PRODUCTION("게임물제작업"),
    PRINTING("인쇄사"),
    PUBLISHING("출판사"),
    MOVIE_PRODUCTION("영화제작업"),
    MOVIE_SCREENING("영화상영업"),
    MOVIE_IMPORT("영화수입업"),
    MOVIE_THEATER("영화상영관"),
    VIDEO_PRODUCTION("비디오물제작업"),
    MOVIE_DISTRIBUTION("영화배급업"),
    VIDEO_WATCHING_SERVICE("비디오물시청제공업"),
    VIDEO_LITTLE_THEATER("비디오물소극장업"),
    VIDEO_DISTRIBUTION("비디오물배급업"),
    VIDEO_ROOM("비디오물감상실업"),
    SINGING_ROOM("노래연습장업"),
    TEENAGER_GAME_SERVICE("청소년게임제공업"),
    GENERAL_GAME_SERVICE("일반게임제공업"),
    INTERNET_COMPUTER_GAME_FACILITY_SERVICE("인터넷컴퓨터게임시설제공업"),
    COMPOSITE_DISTRIBUTION_GAME_SERVICE("복합유통게임제공업"),
    POPULAR_CULTURE_ARTS_PLANNING("대중문화예술기획업"),
    ONLINE_MUSIC_SERVICE("온라인음악서비스제공업"),
    MUSIC_RECORD_VIDEO_DISTRIBUTION("음반.음악영상물배급업"),
    MUSIC_RECORD_PRODUCTION("음반물제작업"),
    MUSIC_RECORD_DISTRIBUTION("음반물배급업"),
    MUSIC_RECORD_VIDEO_PRODUCTION("음반.음악영상물제작업"),
    FOREIGNER_TOUR_CITY_ACCOMMODATION("외국인관광도시민박업"),
    FOREIGNER_AMUSEMENT_RESTAURANT("외국인전용유흥음식점업"),
    TOUR_THEATER_AMUSEMENT("관광극장유흥업"),
    TOUR_TRACK("관광궤도업"),
    INTERNATIONAL_CONFERENCE_FACILITY("국제회의시설업"),
    DOWNTOWN_CIRCULAR_TOUR("시내순환관광업"),
    TOUR_CRUISE_SHIP("관광유람선업"),
    OTHER_AMUSEMENT_FACILITY("유원시설업기타"),
    TOUR_PENSION("관광펜션업"),
    MOTOR_CAMP("자동차야영장업"),
    HANOK_EXPERIENCE("한옥체험업"),
    GENERAL_AMUSEMENT_FACILITY("일반유원시설업"),
    SPECIALIZED_RECREATION("전문휴양업"),
    TOUR_STAGE("관광공연장업"),
    OVERALL_RECREATION("종합휴양업"),
    GENERAL_CAMP("일반야영장업"),
    DOMESTIC_TRAVEL("국내여행업"),
    INTERNATIONAL_CONFERENCE_PLANNING("국제회의기획업"),
    TOUR_AMUSEMENT_RESTAURANT("관광유흥음식점업"),
    TOUR_RESTAURANT("관광식당"),
    INTERNATIONAL_TRAVEL("국외여행업"),
    GENERAL_TRAVEL("일반여행업"),
    STAGE("공연장"),
    TOUR_BUSINESS_OPERATOR("관광사업자"),
    OVERALL_AMUSEMENT_FACILITY("종합유원시설업"),
    TOUR_ACCOMMODATION("관광숙박업"),
    REST_RESTAURANT("휴게음식점"),
    GENERAL_RESTAURANT("일반음식점"),
    BAKERY("제과점영업"),
    CONSIGNMENT_FOOD_SERVICE("위탁급식영업"),
    GROUP_FOOD_SERVICE("집단급식소"),
    HEALTH_FUNCTIONAL_FOOD_DISTRIBUTION_SALE("건강기능식품유통전문판매업"),
    CONTAINER_WRAPPER_MANUFACTURING("용기·포장지제조업"),
    AMUSEMENT_BAR("유흥주점영업"),
    KARAOKE_BAR("단란주점영업"),
    EDIBLE_ICE_SALE("식용얼음판매업"),
    INSTANT_SALE_MANUFACTURING_PROCESSING("즉석판매제조가공업"),
    FOOD_MANUFACTURING_PROCESSING("식품제조가공업"),
    DISTRIBUTION_SALE("유통전문판매업"),
    OTHER_FOOD_SALE("식품판매업기타"),
    HEALTH_FUNCTIONAL_FOOD_GENERAL_SALE("건강기능식품일반판매업"),
    GROUP_FOOD_SERVICE_FOOD_SALE("집단급식소식품판매업"),
    FOOD_SUBDIVISION("식품소분업"),
    FOOD_TRANSPORT("식품운반업"),
    FOOD_ADDITIVES_MANUFACTURING("식품첨가물제조업"),
    FOOD_REFRIGERATION("식품냉동냉장업"),
    FOOD_VENDING_MACHINE("식품자동판매기업"),
    POTTERY_MANUFACTURING("옹기류제조업"),
    REGISTERED_SPORTS_FACILITY("등록체육시설업"),
    BILLIARD_ROOM("당구장업"),
    YACHTING_COURSE("요트장업"),
    SLEDDING_SLOPE("썰매장업"),
    SKI_RESORT("스키장"),
    SWIMMING_POOL("수영장업"),
    ICE_RINK("빙상장업"),
    GOLF_COURSE("골프장"),
    HORSE_RIDING_COURSE("승마장업"),
    GOLF_DRIVING_RANGE("골프연습장업"),
    MARTIAL_ART_ACADEMY("무도학원업"),
    MARTIAL_ART_GYM("무도장업"),
    PHYSICAL_EDUCATION_GYM("체육도장업"),
    PHYSICAL_FITNESS_CENTER("체력단련장업"),
    OTHER_WATER_POLLUTANT_INSTALLATION_FACILITY("수질오염원설치시설기타"),
    EXCRETA_COLLECTION_TRANSPORT("분뇨수집운반업"),
    LIVESTOCK_EXCRETA_COLLECTION_TRANSPORT("가축분뇨수집운반업"),
    SEWAGE_TREATMENT_FACILITY_DESIGN_CONSTRUCTION("단독정화조오수처리시설설계시공업"),
    LIVESTOCK_EXCRETA_DISCHARGE_FACILITY_MANAGEMENT("가축분뇨배출시설관리업사업장"),
    AIR_POLLUTANT_DISCHARGE_FACILITY_INSTALLATION("대기오염물질배출시설설치사업장"),
    DISCHARGE_GAS_MAINTENANCE_CHECK_AGENCY("배출가스전문정비사업자확인검사대행자"),
    INDIVIDUAL_SEWAGE_TREATMENT_FACILITY_MANAGEMENT("개인하수처리시설관리업사업장"),
    HAIRCUTTING("이용업"),
    LAUNDRY("세탁업"),
    BUILDING_SANITATION("건물위생관리업"),
    ACCOMMODATION("숙박업"),
    BEAUTY("미용업"),
    BATHHOUSE("목욕장업"),
    ENVIRONMENTAL_CONSULTING("환경컨설팅회사"),
    ENVIRONMENTAL_MEASUREMENT_AGENCY("환경측정대행업"),
    ENVIRONMENTAL_MANAGEMENT_AGENCY("환경관리대행기관"),
    ENVIRONMENTAL_CONSTRUCTION("환경전문공사업"),
    TIMBER_IMPORT_DISTRIBUTION("목재수입유통업"),
    LUMBERING("제재업"),
    HARDWOOD_PRODUCTION("원목생산업"),
    METER_VERIFICATION("계량기증명업"),
    METER_MANUFACTURING("계량기제조업"),
    METER_IMPORT("계량기수입업"),
    METER_REPAIR("계량기수리업"),
    HIGH_PRESSURE_GAS("고압가스업"),
    COAL_BRIQUETTE_MANUFACTURING("석연탄제조업"),
    PETROLEUM_SALE("석유판매업"),
    PETROLEUM_ALTERNATIVE_FUEL_SALE("석유및석유대체연료판매업체"),
    LIQUEFIED_PETROLEUM_GAS_APPLIANCE_MANUFACTURING("액화석유가스용품제조업체"),
    GENERAL_CITY_GAS("일반도시가스업체"),
    MUTUAL_AID("상조업"),
    ELECTRIC_TECHNOLOGY_SUPERVISION("전력기술감리업체"),
    ELECTRIC_TECHNOLOGY_DESIGN("전력기술설계업체"),
    SPECIFIC_PRESSURE_GAS("특정고압가스업"),
    UNDERGROUND_WATER_CONSTRUCTION("지하수시공업체"),
    UNDERGROUND_WATER_PURIFICATION("지하수정화업체"),
    UNDERGROUND_WATER_IMPACT_ASSESSMENT_ORGANIZATION("지하수영향조사기관"),
    TRADITIONAL_TEMPLE("전통사찰"),
    CONTAINER_FREEZER_SPECIFIC_FACILITY("용기냉동기특정설비"),
    WATER_SUPPLY_CONSTRUCTION_AGENCY("급수공사대행업"),
    DISINFECTION("소독업"),
    BIG_SCALE_STORE("대규모점포"),
    OVERALL_SPORTS_FACILITY("종합체육시설업"),
    STANDARD_PLASTIC_GARBAGE_BAG_SALE("쓰레기종량제봉투판매업"),
    WATER_STORAGE_TANK_CLEANING("저수조청소업"),
    CONSTRUCTION_WASTE_TREATMENT("건설폐기물처리업"),
    CULTURE_ARTS_CORPORATION("문화예술법인"),
    MUSEUM_ART_GALLERY("박물관,미술관"),
    TOBACCO_IMPORT_SALE("담배수입판매업체"),
    TOBACCO_WHOLESALE("담배도매업"),
    TOBACCO_RETAIL("담배소매업"),
    INTERNATIONAL_LOGISTICS_BROKERAGE("물류주선업국제"),
    WAREHOUSE("물류창고업체"),
    CIVIL_DEFENCE_SHELTER_FACILITY("민방위대피시설"),
    CIVIL_DEFENCE_WATER_SUPPLY_FACILITY("민방위급수시설"),
    ELEVATOR_MANUFACTURING_IMPORT("승강기제조및수입업체"),
    ELEVATOR_MAINTENANCE("승강기유지관리업체"),
    FUNERAL_DIRECTOR_EDUCATION_ORGANIZATION("장례지도사교육기관"),
    CAREGIVER_EDUCATION_ORGANIZATION("요양보호사교육기관"),
    FEE_CHARGING_EMPLOYMENT_AGENCY("유료직업소개소"),
    FREE_EMPLOYMENT_AGENCY("무료직업소개소"),
    ADMINISTRATIVE_AGENT("행정사업"),
    DOOR_TO_DOOR_SALE("방문판매업"),
    COLD_CALLING_SALE("전화권유판매업"),
    TELEMARKETING("통신판매업"),
    MULTILEVEL_MARKETING("다단계판매업체"),
    SINGLELEVEL_MARKETING("후원방문판매업체"),
    LOCAL_CULTURE_CENTER("지방문화원"),
    OUTDOOR_ADVERTISING("옥외광고업");

    private final String code;

    BusinessCategory(String code) {
        this.code = code;
    }

    private String getCode() {
        return this.code;
    }

    public static BusinessCategory getByCode(String code) {
        for (BusinessCategory businessCategory : BusinessCategory.values()) {
            if (businessCategory.getCode().equals(code)) {
                return businessCategory;
            }
        }
        return null;
    }
}
