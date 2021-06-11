// AUTOGENERATED BY Generate.java -- DO NOT MODIFY
package com.onthegomap.flatmap.openmaptiles.generated;

public class Tables {

  public static record OsmWaterPolygon(
    com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String natural,
    String landuse, String waterway, boolean isIntermittent, boolean isTunnel, boolean isBridge
  ) {

    public OsmWaterPolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"),
        source.getString("natural"), source.getString("landuse"), source.getString("waterway"),
        source.getBoolean("intermittent"), source.getBoolean("tunnel"), source.getBoolean("bridge"));
    }
  }

  public static record OsmWaterwayLinestring(
    com.onthegomap.flatmap.SourceFeature source, String waterway, String name, String nameEn, String nameDe,
    boolean isTunnel, boolean isBridge, boolean isIntermittent
  ) {

    public OsmWaterwayLinestring(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("waterway"), source.getString("name"), source.getString("name:en"),
        source.getString("name:de"), source.getBoolean("tunnel"), source.getBoolean("bridge"),
        source.getBoolean("intermittent"));
    }
  }

  public static record OsmLandcoverPolygon(com.onthegomap.flatmap.SourceFeature source) {}

  public static record OsmLandusePolygon(
    com.onthegomap.flatmap.SourceFeature source, String landuse, String amenity, String leisure, String tourism,
    String place, String waterway
  ) {

    public OsmLandusePolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("landuse"), source.getString("amenity"), source.getString("leisure"),
        source.getString("tourism"), source.getString("place"), source.getString("waterway"));
    }
  }

  public static record OsmPeakPoint(
    com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String ele, String wikipedia
  ) {

    public OsmPeakPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"),
        source.getString("ele"), source.getString("wikipedia"));
    }
  }

  public static record OsmParkPolygon(
    com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String landuse,
    String leisure, String boundary, String protectionTitle
  ) {

    public OsmParkPolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"),
        source.getString("landuse"), source.getString("leisure"), source.getString("boundary"),
        source.getString("protection_title"));
    }
  }

  public static record OsmBorderDispRelation(
    com.onthegomap.flatmap.SourceFeature source, String name, String boundary, long adminLevel, String claimedBy,
    String disputedBy, boolean maritime
  ) {

    public OsmBorderDispRelation(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("boundary"), source.getLong("admin_level"),
        source.getString("claimed_by"), source.getString("disputed_by"), source.getBoolean("maritime"));
    }
  }

  public static record OsmAerowayPolygon(com.onthegomap.flatmap.SourceFeature source, String ref) {

    public OsmAerowayPolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("ref"));
    }
  }

  public static record OsmAerowayLinestring(com.onthegomap.flatmap.SourceFeature source, String ref, String aeroway) {

    public OsmAerowayLinestring(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("ref"), source.getString("aeroway"));
    }
  }

  public static record OsmAerowayPoint(com.onthegomap.flatmap.SourceFeature source, String ref, String aeroway) {

    public OsmAerowayPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("ref"), source.getString("aeroway"));
    }
  }

  public static record OsmHighwayLinestring(
    com.onthegomap.flatmap.SourceFeature source, String highway, String construction, String ref, String network,
    int zOrder, long layer, long level, boolean indoor, String name, String nameEn, String nameDe, String shortName,
    boolean isTunnel, boolean isBridge, boolean isRamp, boolean isFord, int isOneway, boolean isArea, String service,
    String usage, String publicTransport, String manMade, String bicycle, String foot, String horse, String mtbScale,
    String surface
  ) {

    public OsmHighwayLinestring(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("highway"), source.getString("construction"), source.getString("ref"),
        source.getString("network"), source.getWayZorder(), source.getLong("layer"), source.getLong("level"),
        source.getBoolean("indoor"), source.getString("name"), source.getString("name:en"), source.getString("name:de"),
        source.getString("short_name"), source.getBoolean("tunnel"), source.getBoolean("bridge"),
        source.getBoolean("ramp"), source.getBoolean("ford"), source.getDirection("oneway"), source.getBoolean("area"),
        source.getString("service"), source.getString("usage"), source.getString("public_transport"),
        source.getString("man_made"), source.getString("bicycle"), source.getString("foot"), source.getString("horse"),
        source.getString("mtb:scale"), source.getString("surface"));
    }
  }

  public static record OsmRailwayLinestring(
    com.onthegomap.flatmap.SourceFeature source, String railway, String ref, String network, int zOrder, long layer,
    long level, boolean indoor, String name, String nameEn, String nameDe, String shortName, boolean isTunnel,
    boolean isBridge, boolean isRamp, boolean isFord, int isOneway, boolean isArea, String service, String usage
  ) {

    public OsmRailwayLinestring(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("railway"), source.getString("ref"), source.getString("network"),
        source.getWayZorder(), source.getLong("layer"), source.getLong("level"), source.getBoolean("indoor"),
        source.getString("name"), source.getString("name:en"), source.getString("name:de"),
        source.getString("short_name"), source.getBoolean("tunnel"), source.getBoolean("bridge"),
        source.getBoolean("ramp"), source.getBoolean("ford"), source.getDirection("oneway"), source.getBoolean("area"),
        source.getString("service"), source.getString("usage"));
    }
  }

  public static record OsmAerialwayLinestring(
    com.onthegomap.flatmap.SourceFeature source, String aerialway, int zOrder, long layer, String name, String nameEn,
    String nameDe, String shortName, boolean isTunnel, boolean isBridge, boolean isRamp, boolean isFord, int isOneway,
    boolean isArea, String service, String usage
  ) {

    public OsmAerialwayLinestring(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("aerialway"), source.getWayZorder(), source.getLong("layer"),
        source.getString("name"), source.getString("name:en"), source.getString("name:de"),
        source.getString("short_name"), source.getBoolean("tunnel"), source.getBoolean("bridge"),
        source.getBoolean("ramp"), source.getBoolean("ford"), source.getDirection("oneway"), source.getBoolean("area"),
        source.getString("service"), source.getString("usage"));
    }
  }

  public static record OsmShipwayLinestring(
    com.onthegomap.flatmap.SourceFeature source, String shipway, int zOrder, long layer, String name, String nameEn,
    String nameDe, String shortName, boolean isTunnel, boolean isBridge, boolean isRamp, boolean isFord, int isOneway,
    boolean isArea, String service, String usage
  ) {

    public OsmShipwayLinestring(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("route"), source.getWayZorder(), source.getLong("layer"), source.getString("name"),
        source.getString("name:en"), source.getString("name:de"), source.getString("short_name"),
        source.getBoolean("tunnel"), source.getBoolean("bridge"), source.getBoolean("ramp"), source.getBoolean("ford"),
        source.getDirection("oneway"), source.getBoolean("area"), source.getString("service"),
        source.getString("usage"));
    }
  }

  public static record OsmHighwayPolygon(
    com.onthegomap.flatmap.SourceFeature source, String highway, int zOrder, long layer, long level, boolean indoor,
    boolean isArea, String publicTransport, String manMade
  ) {

    public OsmHighwayPolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("highway"), source.getWayZorder(), source.getLong("layer"), source.getLong("level"),
        source.getBoolean("indoor"), source.getBoolean("area"), source.getString("public_transport"),
        source.getString("man_made"));
    }
  }

  public static record OsmRouteMember(
    com.onthegomap.flatmap.SourceFeature source, String ref, String network, String name
  ) {

    public OsmRouteMember(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("ref"), source.getString("network"), source.getString("name"));
    }
  }

  public static record OsmBuildingPolygon(
    com.onthegomap.flatmap.SourceFeature source, String material, String colour, String building, String buildingpart,
    String buildingheight, String buildingminHeight, String buildinglevels, String buildingminLevel, String height,
    String minHeight, String levels, String minLevel
  ) {

    public OsmBuildingPolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("building:material"), source.getString("building:colour"),
        source.getString("building"), source.getString("building:part"), source.getString("building:height"),
        source.getString("building:min_height"), source.getString("building:levels"),
        source.getString("building:min_level"), source.getString("height"), source.getString("min_height"),
        source.getString("levels"), source.getString("min_level"));
    }
  }

  public static record OsmBuildingRelation(
    com.onthegomap.flatmap.SourceFeature source, String building, String material, String colour, String buildingpart,
    String buildingheight, String height, String buildingminHeight, String minHeight, String buildinglevels,
    String levels, String buildingminLevel, String minLevel, String relbuildingheight, String relheight,
    String relbuildingminHeight, String relminHeight, String relbuildinglevels, String rellevels,
    String relbuildingminLevel, String relminLevel
  ) {

    public OsmBuildingRelation(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("building"), source.getString("building:material"),
        source.getString("building:colour"), source.getString("building:part"), source.getString("building:height"),
        source.getString("height"), source.getString("building:min_height"), source.getString("min_height"),
        source.getString("building:levels"), source.getString("levels"), source.getString("building:min_level"),
        source.getString("min_level"), source.getString("building:height"), source.getString("height"),
        source.getString("building:min_height"), source.getString("min_height"), source.getString("building:levels"),
        source.getString("levels"), source.getString("building:min_level"), source.getString("min_level"));
    }
  }

  public static record OsmMarinePoint(
    com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String place, long rank,
    boolean isIntermittent
  ) {

    public OsmMarinePoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"),
        source.getString("place"), source.getLong("rank"), source.getBoolean("intermittent"));
    }
  }

  public static record OsmContinentPoint(
    com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe
  ) {

    public OsmContinentPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"));
    }
  }

  public static record OsmCountryPoint(
    com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, long rank,
    String countryCodeIso31661Alpha2, String iso31661Alpha2, String iso31661
  ) {

    public OsmCountryPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"),
        source.getLong("rank"), source.getString("country_code_iso3166_1_alpha_2"),
        source.getString("ISO3166-1:alpha2"), source.getString("ISO3166-1"));
    }
  }

  public static record OsmIslandPolygon(
    com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, long rank
  ) {

    public OsmIslandPolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"),
        source.getLong("rank"));
    }
  }

  public static record OsmIslandPoint(
    com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, long rank
  ) {

    public OsmIslandPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"),
        source.getLong("rank"));
    }
  }

  public static record OsmStatePoint(
    com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String isInCountry,
    String isInCountryCode, String ref, long rank
  ) {

    public OsmStatePoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"),
        source.getString("is_in:country"), source.getString("is_in:country_code"), source.getString("ref"),
        source.getLong("rank"));
    }
  }

  public static record OsmCityPoint(
    com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String place,
    long population, String capital, long rank
  ) {

    public OsmCityPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"),
        source.getString("place"), source.getLong("population"), source.getString("capital"), source.getLong("rank"));
    }
  }

  public static record OsmHousenumberPoint(com.onthegomap.flatmap.SourceFeature source, String housenumber) {

    public OsmHousenumberPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("addr:housenumber"));
    }
  }

  public static record OsmPoiPoint(
    com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String station,
    String funicular, String information, String uicRef, String religion, long level, boolean indoor, long layer,
    String sport
  ) {

    public OsmPoiPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"),
        source.getString("station"), source.getString("funicular"), source.getString("information"),
        source.getString("uic_ref"), source.getString("religion"), source.getLong("level"), source.getBoolean("indoor"),
        source.getLong("layer"), source.getString("sport"));
    }
  }

  public static record OsmPoiPolygon(
    com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String station,
    String funicular, String information, String uicRef, String religion, long level, boolean indoor, long layer,
    String sport
  ) {

    public OsmPoiPolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"),
        source.getString("station"), source.getString("funicular"), source.getString("information"),
        source.getString("uic_ref"), source.getString("religion"), source.getLong("level"), source.getBoolean("indoor"),
        source.getLong("layer"), source.getString("sport"));
    }
  }

  public static record OsmAerodromeLabelPoint(
    com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String aerodromeType,
    String aerodrome, String military, String iata, String icao, String ele
  ) {

    public OsmAerodromeLabelPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"),
        source.getString("aerodrome:type"), source.getString("aerodrome"), source.getString("military"),
        source.getString("iata"), source.getString("icao"), source.getString("ele"));
    }
  }
}
