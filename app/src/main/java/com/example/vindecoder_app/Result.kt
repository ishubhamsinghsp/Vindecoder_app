package com.example.vindecoder_app

data class Result(
    var ABS: String? = null,
    var ActiveSafetySysNote: String? = null,
    var AdaptiveCruiseControl: String? = null,
    var AdaptiveDrivingBeam: String? = null,
    var AdaptiveHeadlights: String? = null,
    var AdditionalErrorText: String? = null,
    var AirBagLocCurtain: String? = null,
    var AirBagLocFront: String? = null,
    var AirBagLocKnee: String? = null,
    var AirBagLocSeatCushion: String? = null,
    var AirBagLocSide: String? = null,
    var AutoReverseSystem: String? = null,
    var AutomaticPedestrianAlertingSound: String? = null,
    var AxleConfiguration: String? = null,
    var Axles: String? = null,
    var BasePrice: String? = null,
    var BatteryA: String? = null,
    var BatteryA_to: String? = null,
    var BatteryCells: String? = null,
    var BatteryInfo: String? = null,
    var BatteryKWh: String? = null,
    var BatteryKWh_to: String? = null,
    var BatteryModules: String? = null,
    var BatteryPacks: String? = null,
    var BatteryType: String? = null,
    var BatteryV: String? = null,
    var BatteryV_to: String? = null,
    var BedLengthIN: String? = null,
    var BedType: String? = null,
    var BlindSpotIntervention: String? = null,
    var BlindSpotMon: String? = null,
    var BodyCabType: String? = null,
    var BodyClass: String? = null,
    var BrakeSystemDesc: String? = null,
    var BrakeSystemType: String? = null,
    var BusFloorConfigType: String? = null,
    var BusLength: String? = null,
    var BusType: String? = null,
    var CAN_AACN: String? = null,
    var CIB: String? = null,
    var CashForClunkers: String? = null,
    var ChargerLevel: String? = null,
    var ChargerPowerKW: String? = null,
    var CoolingType: String? = null,
    var CurbWeightLB: String? = null,
    var CustomMotorcycleType: String? = null,
    var DaytimeRunningLight: String? = null,
    var DestinationMarket: String? = null,
    var DisplacementCC: String? = null,
    var DisplacementCI: String? = null,
    var DisplacementL: String? = null,
    var Doors: String? = null,
    var DriveType: String? = null,
    var DriverAssist: String? = null,
    var DynamicBrakeSupport: String? = null,
    var EDR: String? = null,
    var ESC: String? = null,
    var EVDriveUnit: String? = null,
    var ElectrificationLevel: String? = null,
    var EngineConfiguration: String? = null,
    var EngineCycles: String? = null,
    var EngineCylinders: String? = null,
    var EngineHP: String? = null,
    var EngineHP_to: String? = null,
    var EngineKW: String? = null,
    var EngineManufacturer: String? = null,
    var EngineModel: String? = null,
    var EntertainmentSystem: String? = null,
    var ErrorCode: String? = null,
    var ErrorText: String? = null,
    var ForwardCollisionWarning: String? = null,
    var FuelInjectionType: String? = null,
    var FuelTypePrimary: String? = null,
    var FuelTypeSecondary: String? = null,
    var GCWR: String? = null,
    var GCWR_to: String? = null,
    var GVWR: String? = null,
    var GVWR_to: String? = null,
    var KeylessIgnition: String? = null,
    var LaneCenteringAssistance: String? = null,
    var LaneDepartureWarning: String? = null,
    var LaneKeepSystem: String? = null,
    var LowerBeamHeadlampLightSource: String? = null,
    var Make: String? = null,
    var MakeID: String? = null,
    var Manufacturer: String? = null,
    var ManufacturerId: String? = null,
    var Model: String? = null,
    var ModelID: String? = null,
    var ModelYear: String? = null,
    var MotorcycleChassisType: String? = null,
    var MotorcycleSuspensionType: String? = null,
    var NCSABodyType: String? = null,
    var NCSAMake: String? = null,
    var NCSAMapExcApprovedBy: String? = null,
    var NCSAMapExcApprovedOn: String? = null,
    var NCSAMappingException: String? = null,
    var NCSAModel: String? = null,
    var NCSANote: String? = null,
    var NonLandUse: String? = null,
    var Note: String? = null,
    var OtherBusInfo: String? = null,
    var OtherEngineInfo: String? = null,
    var OtherMotorcycleInfo: String? = null,
    var OtherRestraintSystemInfo: String? = null,
    var OtherTrailerInfo: String? = null,
    var ParkAssist: String? = null,
    var PedestrianAutomaticEmergencyBraking: String? = null,
    var PlantCity: String? = null,
    var PlantCompanyName: String? = null,
    var PlantCountry: String? = null,
    var PlantState: String? = null,
    var Possiblevarues: String? = null,
    var Pretensioner: String? = null,
    var RearAutomaticEmergencyBraking: String? = null,
    var RearCrossTrafficAlert: String? = null,
    var RearVisibilitySystem: String? = null,
    var SAEAutomationLevel: String? = null,
    var SAEAutomationLevel_to: String? = null,
    var SeatBeltsAll: String? = null,
    var SeatRows: String? = null,
    var Seats: String? = null,
    var SemiautomaticHeadlampBeamSwitching: String? = null,
    var Series: String? = null,
    var Series2: String? = null,
    var SteeringLocation: String? = null,
    var SuggestedVIN: String? = null,
    var TPMS: String? = null,
    var TopSpeedMPH: String? = null,
    var TrackWidth: String? = null,
    var TractionControl: String? = null,
    var TrailerBodyType: String? = null,
    var TrailerLength: String? = null,
    var TrailerType: String? = null,
    var TransmissionSpeeds: String? = null,
    var TransmissionStyle: String? = null,
    var Trim: String? = null,
    var Trim2: String? = null,
    var Turbo: String? = null,
    var VIN: String? = null,
    var varveTrainDesign: String? = null,
    var VehicleDescriptor: String? = null,
    var VehicleType: String? = null,
    var WheelBaseLong: String? = null,
    var WheelBaseShort: String? = null,
    var WheelBaseType: String? = null,
    var WheelSizeFront: String? = null,
    var WheelSizeRear: String? = null,
    var Wheels: String? = null,
    var Windows: String? = null
)