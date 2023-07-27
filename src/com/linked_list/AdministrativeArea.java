package com.linked_list;

import java.util.Arrays;

interface IProvince {
    ICity addCity(String cityName);
    ICity[] getCityList();
    int getCityLength ();
    String getProvinceName();
}

interface ICity {
    ICounty[] getCountyList();
    int getCountyLength();
    ICounty addCounty(String countyName);
    String getCityName();
}

interface ICounty {
    String getCountyName();
}

public class AdministrativeArea {

    private IProvince[] provinceList = new Province[5];
    private int provinceLength = 0;

    public AdministrativeArea () {}

    public int getProvinceLength () {
        return provinceLength;
    }

    public IProvince[] getProvinceList () {
        return provinceList;
    }

    public Province addProvince (String provinceName) {
        Province province  = new Province(provinceName);

        if (provinceLength >= provinceList.length) {
            int len = provinceList.length * 2;
            provinceList = Arrays.copyOf(provinceList, len);
        }

        provinceList[provinceLength ++] = province;

        return province;
    }

    private class Province implements IProvince {
        private String provinceName;
        private ICity[] cityList = new City[5];
        private int cityLength;

        public Province () {}

        public Province (String name) {
            provinceName = name;
        }

        public String getProvinceName () {
            return provinceName;
        }

        public City addCity (String cityName) {
            City city = new City(cityName);

            if (cityLength >= cityList.length) {
                int len = cityList.length * 2;
                cityList = Arrays.copyOf(cityList, len);
            }

            cityList[cityLength ++] = city;

            return city;
        }

        public ICity[] getCityList () {
            return cityList;
        }

        public int getCityLength () {
            return cityLength;
        }


        private class City implements ICity {
            private String cityName;
            private ICounty[] countyList = new County[5];
            private int countyLength;

            public City () {}

            public City (String name) {
                cityName = name;
            }

            public ICounty[] getCountyList () {
                return countyList;
            }

            public int getCountyLength () {
                return countyLength;
            }

            public String getCityName () {
                return cityName;
            }

            public County addCounty (String countyName) {
                County county = new County(countyName);

                if (countyLength >= countyList.length) {
                    int len = countyList.length * 2;
                    countyList = Arrays.copyOf(countyList, len);
                }

                countyList[countyLength ++] = county;

                return county;
            }

            private class County implements ICounty {
                private String countyName;

                public County () {}

                public County (String name) {
                    countyName = name;
                }

                public String getCountyName () {
                    return countyName;
                }
            }
        }
    }
}
