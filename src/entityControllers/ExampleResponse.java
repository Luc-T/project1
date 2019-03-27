package entityControllers;

public class ExampleResponse {

    public String getResponse() {
        return response;
    }

    private String response = "{\n" +
            "    \"q\": \"chicken\",\n" +
            "    \"from\": 0,\n" +
            "    \"to\": 3,\n" +
            "    \"params\": {\n" +
            "        \"sane\": [ ],\n" +
            "        \"to\": [\n" +
            "            \"3\"\n" +
            "        ],\n" +
            "        \"q\": [\n" +
            "            \"chicken\"\n" +
            "        ],\n" +
            "        \"calories\": [\n" +
            "            \"591-722\"\n" +
            "        ],\n" +
            "        \"app_id\": [\n" +
            "            \"app_id\"\n" +
            "        ],\n" +
            "        \"app_key\": [\n" +
            "            \"app_key\"\n" +
            "        ],\n" +
            "        \"from\": [\n" +
            "            \"0\"\n" +
            "        ],\n" +
            "        \"health\": [\n" +
            "            \"alcohol-free\"\n" +
            "        ]\n" +
            "    },\n" +
            "    \"more\": true,\n" +
            "    \"count\": 4652,\n" +
            "    \"hits\": [\n" +
            "        {\n" +
            "            \"recipe\": {\n" +
            "                \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#recipe_56008870a1e326be7851141fc49bd53e\",\n" +
            "                \"label\": \"Roast Chicken\",\n" +
            "                \"image\": \"https://www.edamam.com/web-img/c24/c24a86f98a8cc1f13f795bdba2dae614.jpg\",\n" +
            "                \"source\": \"Epicurious\",\n" +
            "                \"url\": \"http://www.epicurious.com/recipes/food/views/Roast-Chicken-394676\",\n" +
            "                \"shareAs\": \"http://www.edamam.com/recipe/roast-chicken-56008870a1e326be7851141fc49bd53e/chicken/591-722-cal/alcohol-free\",\n" +
            "                \"yield\": 4.0,\n" +
            "                \"dietLabels\": [\n" +
            "                    \"Low-Carb\"\n" +
            "                ],\n" +
            "                \"healthLabels\": [\n" +
            "                    \"Sugar-Conscious\",\n" +
            "                    \"Peanut-Free\",\n" +
            "                    \"Tree-Nut-Free\",\n" +
            "                    \"Alcohol-Free\"\n" +
            "                ],\n" +
            "                \"cautions\": [ ],\n" +
            "                \"ingredientLines\": [\n" +
            "                    \"1 tablespoon kosher salt\",\n" +
            "                    \"1 whole 4-pound chicken, giblets reserved for another use\",\n" +
            "                    \"1/4 cup (1/2 stick) unsalted butter, melted\"\n" +
            "                ],\n" +
            "                \"ingredients\": [\n" +
            "                    {\n" +
            "                        \"text\": \"1 tablespoon kosher salt\",\n" +
            "                        \"weight\": 14.772500991821289\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"text\": \"1 whole 4-pound chicken, giblets reserved for another use\",\n" +
            "                        \"weight\": 920.0\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"text\": \"1/4 cup (1/2 stick) unsalted butter, melted\",\n" +
            "                        \"weight\": 56.75\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"calories\": 2384.8974999999996,\n" +
            "                \"totalWeight\": 980.9328012023324,\n" +
            "                \"totalNutrients\": {\n" +
            "                    \"ENERC_KCAL\": {\n" +
            "                        \"label\": \"Energy\",\n" +
            "                        \"quantity\": 2384.8974999999996,\n" +
            "                        \"unit\": \"kcal\"\n" +
            "                    },\n" +
            "                    \"FAT\": {\n" +
            "                        \"label\": \"Fat\",\n" +
            "                        \"quantity\": 184.58192499999998,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"FASAT\": {\n" +
            "                        \"label\": \"Saturated\",\n" +
            "                        \"quantity\": 68.80333999999999,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"FATRN\": {\n" +
            "                        \"label\": \"Trans\",\n" +
            "                        \"quantity\": 2.752665,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"FAMS\": {\n" +
            "                        \"label\": \"Monounsaturated\",\n" +
            "                        \"quantity\": 69.3374175,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"FAPU\": {\n" +
            "                        \"label\": \"Polyunsaturated\",\n" +
            "                        \"quantity\": 31.4429025,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"CHOCDF\": {\n" +
            "                        \"label\": \"Carbs\",\n" +
            "                        \"quantity\": 0.03405,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"SUGAR\": {\n" +
            "                        \"label\": \"Sugars\",\n" +
            "                        \"quantity\": 0.03405,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"PROCNT\": {\n" +
            "                        \"label\": \"Protein\",\n" +
            "                        \"quantity\": 171.602375,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"CHOLE\": {\n" +
            "                        \"label\": \"Cholesterol\",\n" +
            "                        \"quantity\": 812.0125,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"NA\": {\n" +
            "                        \"label\": \"Sodium\",\n" +
            "                        \"quantity\": 6375.768434410095,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"CA\": {\n" +
            "                        \"label\": \"Calcium\",\n" +
            "                        \"quantity\": 118.3654002380371,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"MG\": {\n" +
            "                        \"label\": \"Magnesium\",\n" +
            "                        \"quantity\": 185.2827250099182,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"K\": {\n" +
            "                        \"label\": \"Potassium\",\n" +
            "                        \"quantity\": 1753.6018000793456,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"FE\": {\n" +
            "                        \"label\": \"Iron\",\n" +
            "                        \"quantity\": 8.34009925327301,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"ZN\": {\n" +
            "                        \"label\": \"Zinc\",\n" +
            "                        \"quantity\": 12.117847500991822,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"P\": {\n" +
            "                        \"label\": \"Phosphorus\",\n" +
            "                        \"quantity\": 1366.0199999999998,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"VITA_RAE\": {\n" +
            "                        \"label\": \"Vitamin A\",\n" +
            "                        \"quantity\": 765.37,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    },\n" +
            "                    \"VITC\": {\n" +
            "                        \"label\": \"Vitamin C\",\n" +
            "                        \"quantity\": 14.719999999999999,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"THIA\": {\n" +
            "                        \"label\": \"Thiamin (B1)\",\n" +
            "                        \"quantity\": 0.5548375,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"RIBF\": {\n" +
            "                        \"label\": \"Riboflavin (B2)\",\n" +
            "                        \"quantity\": 1.123295,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"NIA\": {\n" +
            "                        \"label\": \"Niacin (B3)\",\n" +
            "                        \"quantity\": 62.59303499999999,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"VITB6A\": {\n" +
            "                        \"label\": \"Vitamin B6\",\n" +
            "                        \"quantity\": 3.2217024999999997,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"FOLDFE\": {\n" +
            "                        \"label\": \"Folate (Equivalent)\",\n" +
            "                        \"quantity\": 56.902499999999996,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    },\n" +
            "                    \"VITB12\": {\n" +
            "                        \"label\": \"Vitamin B12\",\n" +
            "                        \"quantity\": 2.9484749999999997,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    },\n" +
            "                    \"VITD\": {\n" +
            "                        \"label\": \"Vitamin D\",\n" +
            "                        \"quantity\": 126.05,\n" +
            "                        \"unit\": \"IU\"\n" +
            "                    },\n" +
            "                    \"TOCPHA\": {\n" +
            "                        \"label\": \"Vitamin E\",\n" +
            "                        \"quantity\": 4.0766,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"VITK1\": {\n" +
            "                        \"label\": \"Vitamin K\",\n" +
            "                        \"quantity\": 17.7725,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    }\n" +
            "                },\n" +
            "                \"totalDaily\": {\n" +
            "                    \"ENERC_KCAL\": {\n" +
            "                        \"label\": \"Energy\",\n" +
            "                        \"quantity\": 119.24487499999998,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"FAT\": {\n" +
            "                        \"label\": \"Fat\",\n" +
            "                        \"quantity\": 283.97219230769224,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"FASAT\": {\n" +
            "                        \"label\": \"Saturated\",\n" +
            "                        \"quantity\": 344.01669999999996,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"CHOCDF\": {\n" +
            "                        \"label\": \"Carbs\",\n" +
            "                        \"quantity\": 0.011349999999999999,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"PROCNT\": {\n" +
            "                        \"label\": \"Protein\",\n" +
            "                        \"quantity\": 343.20475,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"CHOLE\": {\n" +
            "                        \"label\": \"Cholesterol\",\n" +
            "                        \"quantity\": 270.67083333333335,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"NA\": {\n" +
            "                        \"label\": \"Sodium\",\n" +
            "                        \"quantity\": 265.65701810042066,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"CA\": {\n" +
            "                        \"label\": \"Calcium\",\n" +
            "                        \"quantity\": 11.836540023803709,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"MG\": {\n" +
            "                        \"label\": \"Magnesium\",\n" +
            "                        \"quantity\": 46.32068125247955,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"K\": {\n" +
            "                        \"label\": \"Potassium\",\n" +
            "                        \"quantity\": 50.10290857369559,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"FE\": {\n" +
            "                        \"label\": \"Iron\",\n" +
            "                        \"quantity\": 46.333884740405615,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"ZN\": {\n" +
            "                        \"label\": \"Zinc\",\n" +
            "                        \"quantity\": 80.78565000661214,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"P\": {\n" +
            "                        \"label\": \"Phosphorus\",\n" +
            "                        \"quantity\": 195.14571428571423,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"VITA_RAE\": {\n" +
            "                        \"label\": \"Vitamin A\",\n" +
            "                        \"quantity\": 85.0411111111111,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"VITC\": {\n" +
            "                        \"label\": \"Vitamin C\",\n" +
            "                        \"quantity\": 24.533333333333335,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"THIA\": {\n" +
            "                        \"label\": \"Thiamin (B1)\",\n" +
            "                        \"quantity\": 36.98916666666667,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"RIBF\": {\n" +
            "                        \"label\": \"Riboflavin (B2)\",\n" +
            "                        \"quantity\": 66.07617647058824,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"NIA\": {\n" +
            "                        \"label\": \"Niacin (B3)\",\n" +
            "                        \"quantity\": 312.96517499999993,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"VITB6A\": {\n" +
            "                        \"label\": \"Vitamin B6\",\n" +
            "                        \"quantity\": 161.08512499999998,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"FOLDFE\": {\n" +
            "                        \"label\": \"Folate (Equivalent)\",\n" +
            "                        \"quantity\": 14.225625,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"VITB12\": {\n" +
            "                        \"label\": \"Vitamin B12\",\n" +
            "                        \"quantity\": 49.14124999999999,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"VITD\": {\n" +
            "                        \"label\": \"Vitamin D\",\n" +
            "                        \"quantity\": 31.5125,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"TOCPHA\": {\n" +
            "                        \"label\": \"Vitamin E\",\n" +
            "                        \"quantity\": 20.383000000000003,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"VITK1\": {\n" +
            "                        \"label\": \"Vitamin K\",\n" +
            "                        \"quantity\": 22.215625,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    }\n" +
            "                },\n" +
            "                \"digest\": [\n" +
            "                    {\n" +
            "                        \"label\": \"Fat\",\n" +
            "                        \"tag\": \"FAT\",\n" +
            "                        \"schemaOrgTag\": \"fatContent\",\n" +
            "                        \"total\": 184.58192499999998,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 283.97219230769224,\n" +
            "                        \"unit\": \"g\",\n" +
            "                        \"sub\": [\n" +
            "                            {\n" +
            "                                \"label\": \"Saturated\",\n" +
            "                                \"tag\": \"FASAT\",\n" +
            "                                \"schemaOrgTag\": \"saturatedFatContent\",\n" +
            "                                \"total\": 68.80333999999999,\n" +
            "                                \"hasRDI\": true,\n" +
            "                                \"daily\": 344.01669999999996,\n" +
            "                                \"unit\": \"g\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"label\": \"Trans\",\n" +
            "                                \"tag\": \"FATRN\",\n" +
            "                                \"schemaOrgTag\": \"transFatContent\",\n" +
            "                                \"total\": 2.752665,\n" +
            "                                \"hasRDI\": false,\n" +
            "                                \"daily\": 0.0,\n" +
            "                                \"unit\": \"g\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"label\": \"Monounsaturated\",\n" +
            "                                \"tag\": \"FAMS\",\n" +
            "                                \"schemaOrgTag\": null,\n" +
            "                                \"total\": 69.3374175,\n" +
            "                                \"hasRDI\": false,\n" +
            "                                \"daily\": 0.0,\n" +
            "                                \"unit\": \"g\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"label\": \"Polyunsaturated\",\n" +
            "                                \"tag\": \"FAPU\",\n" +
            "                                \"schemaOrgTag\": null,\n" +
            "                                \"total\": 31.4429025,\n" +
            "                                \"hasRDI\": false,\n" +
            "                                \"daily\": 0.0,\n" +
            "                                \"unit\": \"g\"\n" +
            "                            }\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Carbs\",\n" +
            "                        \"tag\": \"CHOCDF\",\n" +
            "                        \"schemaOrgTag\": \"carbohydrateContent\",\n" +
            "                        \"total\": 0.03405,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 0.011349999999999999,\n" +
            "                        \"unit\": \"g\",\n" +
            "                        \"sub\": [\n" +
            "                            {\n" +
            "                                \"label\": \"Carbs (net)\",\n" +
            "                                \"tag\": \"CHOCDF.net\",\n" +
            "                                \"schemaOrgTag\": null,\n" +
            "                                \"total\": 0.03405,\n" +
            "                                \"hasRDI\": false,\n" +
            "                                \"daily\": 0.0,\n" +
            "                                \"unit\": \"g\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"label\": \"Fiber\",\n" +
            "                                \"tag\": \"FIBTG\",\n" +
            "                                \"schemaOrgTag\": \"fiberContent\",\n" +
            "                                \"total\": 0.0,\n" +
            "                                \"hasRDI\": false,\n" +
            "                                \"daily\": 0.0,\n" +
            "                                \"unit\": \"g\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"label\": \"Sugars\",\n" +
            "                                \"tag\": \"SUGAR\",\n" +
            "                                \"schemaOrgTag\": \"sugarContent\",\n" +
            "                                \"total\": 0.03405,\n" +
            "                                \"hasRDI\": false,\n" +
            "                                \"daily\": 0.0,\n" +
            "                                \"unit\": \"g\"\n" +
            "                            }\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Protein\",\n" +
            "                        \"tag\": \"PROCNT\",\n" +
            "                        \"schemaOrgTag\": \"proteinContent\",\n" +
            "                        \"total\": 171.602375,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 343.20475,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Cholesterol\",\n" +
            "                        \"tag\": \"CHOLE\",\n" +
            "                        \"schemaOrgTag\": \"cholesterolContent\",\n" +
            "                        \"total\": 812.0125,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 270.67083333333335,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Sodium\",\n" +
            "                        \"tag\": \"NA\",\n" +
            "                        \"schemaOrgTag\": \"sodiumContent\",\n" +
            "                        \"total\": 6375.768434410095,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 265.65701810042066,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Calcium\",\n" +
            "                        \"tag\": \"CA\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 118.3654002380371,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 11.836540023803709,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Magnesium\",\n" +
            "                        \"tag\": \"MG\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 185.2827250099182,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 46.32068125247955,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Potassium\",\n" +
            "                        \"tag\": \"K\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 1753.6018000793456,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 50.10290857369559,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Iron\",\n" +
            "                        \"tag\": \"FE\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 8.34009925327301,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 46.333884740405615,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Zinc\",\n" +
            "                        \"tag\": \"ZN\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 12.117847500991822,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 80.78565000661214,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Phosphorus\",\n" +
            "                        \"tag\": \"P\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 1366.0199999999998,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 195.14571428571423,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Vitamin A\",\n" +
            "                        \"tag\": \"VITA_RAE\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 765.37,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 85.0411111111111,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Vitamin C\",\n" +
            "                        \"tag\": \"VITC\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 14.719999999999999,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 24.533333333333335,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Thiamin (B1)\",\n" +
            "                        \"tag\": \"THIA\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 0.5548375,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 36.98916666666667,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Riboflavin (B2)\",\n" +
            "                        \"tag\": \"RIBF\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 1.123295,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 66.07617647058824,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Niacin (B3)\",\n" +
            "                        \"tag\": \"NIA\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 62.59303499999999,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 312.96517499999993,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Vitamin B6\",\n" +
            "                        \"tag\": \"VITB6A\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 3.2217024999999997,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 161.08512499999998,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Folate (Equivalent)\",\n" +
            "                        \"tag\": \"FOLDFE\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 56.902499999999996,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 14.225625,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Vitamin B12\",\n" +
            "                        \"tag\": \"VITB12\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 2.9484749999999997,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 49.14124999999999,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Vitamin D\",\n" +
            "                        \"tag\": \"VITD\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 126.05,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 31.5125,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Vitamin E\",\n" +
            "                        \"tag\": \"TOCPHA\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 4.0766,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 20.383000000000003,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Vitamin K\",\n" +
            "                        \"tag\": \"VITK1\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 17.7725,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 22.215625,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    }\n" +
            "                ]\n" +
            "            },\n" +
            "            \"bookmarked\": false,\n" +
            "            \"bought\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"recipe\": {\n" +
            "                \"uri\": \"http://www.edamam.com/ontologies/edamam.owl#recipe_96e47404001d7122cb2359216c4fa3d6\",\n" +
            "                \"label\": \"Chicken Schnitzel\",\n" +
            "                \"image\": \"https://www.edamam.com/web-img/386/38661235d4edca562f7d742c52800be9.jpg\",\n" +
            "                \"source\": \"Serious Eats\",\n" +
            "                \"url\": \"http://www.seriouseats.com/recipes/2011/06/chicken-schnitzel-recipe.html\",\n" +
            "                \"shareAs\": \"http://www.edamam.com/recipe/chicken-schnitzel-96e47404001d7122cb2359216c4fa3d6/chicken/591-722-cal/alcohol-free\",\n" +
            "                \"yield\": 4.0,\n" +
            "                \"dietLabels\": [ ],\n" +
            "                \"healthLabels\": [\n" +
            "                    \"Sugar-Conscious\",\n" +
            "                    \"Peanut-Free\",\n" +
            "                    \"Tree-Nut-Free\",\n" +
            "                    \"Alcohol-Free\"\n" +
            "                ],\n" +
            "                \"cautions\": [ ],\n" +
            "                \"ingredientLines\": [\n" +
            "                    \"One pound skinless boneless chicken breasts\",\n" +
            "                    \"2 cups all purpose flour\",\n" +
            "                    \"2 eggs, lightly beaten\",\n" +
            "                    \"2 cups very fine, fresh breadcrumbs\",\n" +
            "                    \"1/2 teaspoon salt\",\n" +
            "                    \"1/2 teaspoon pepper\",\n" +
            "                    \"2 tablespoons butter\",\n" +
            "                    \"1 tablespoon vegetable oil\"\n" +
            "                ],\n" +
            "                \"ingredients\": [\n" +
            "                    {\n" +
            "                        \"text\": \"One pound skinless boneless chicken breasts\",\n" +
            "                        \"weight\": 453.5923767089844\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"text\": \"2 cups all purpose flour\",\n" +
            "                        \"weight\": 250.0\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"text\": \"2 eggs, lightly beaten\",\n" +
            "                        \"weight\": 86.0\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"text\": \"2 cups very fine, fresh breadcrumbs\",\n" +
            "                        \"weight\": 216.0\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"text\": \"1/2 teaspoon salt\",\n" +
            "                        \"weight\": 3.0\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"text\": \"1/2 teaspoon pepper\",\n" +
            "                        \"weight\": 1.4500000476837158\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"text\": \"2 tablespoons butter\",\n" +
            "                        \"weight\": 28.399999618530273\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"text\": \"1 tablespoon vegetable oil\",\n" +
            "                        \"weight\": 14.0\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"calories\": 2761.51834943533,\n" +
            "                \"totalWeight\": 1050.796127053578,\n" +
            "                \"totalNutrients\": {\n" +
            "                    \"ENERC_KCAL\": {\n" +
            "                        \"label\": \"Energy\",\n" +
            "                        \"quantity\": 2761.51834943533,\n" +
            "                        \"unit\": \"kcal\"\n" +
            "                    },\n" +
            "                    \"FAT\": {\n" +
            "                        \"label\": \"Fat\",\n" +
            "                        \"quantity\": 71.04322996191979,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"FASAT\": {\n" +
            "                        \"label\": \"Saturated\",\n" +
            "                        \"quantity\": 23.748300885581973,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"FATRN\": {\n" +
            "                        \"label\": \"Trans\",\n" +
            "                        \"quantity\": 1.1027634538650513,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"FAMS\": {\n" +
            "                        \"label\": \"Monounsaturated\",\n" +
            "                        \"quantity\": 24.757730895688535,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"FAPU\": {\n" +
            "                        \"label\": \"Polyunsaturated\",\n" +
            "                        \"quantity\": 12.321194666113852,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"CHOCDF\": {\n" +
            "                        \"label\": \"Carbs\",\n" +
            "                        \"quantity\": 347.81531503026486,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"FIBTG\": {\n" +
            "                        \"label\": \"Fiber\",\n" +
            "                        \"quantity\": 16.83685001206398,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"SUGAR\": {\n" +
            "                        \"label\": \"Sugars\",\n" +
            "                        \"quantity\": 14.411520000076294,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"PROCNT\": {\n" +
            "                        \"label\": \"Protein\",\n" +
            "                        \"quantity\": 167.91293976123333,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    \"CHOLE\": {\n" +
            "                        \"label\": \"Cholesterol\",\n" +
            "                        \"quantity\": 712.1024341773987,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"NA\": {\n" +
            "                        \"label\": \"Sodium\",\n" +
            "                        \"quantity\": 3078.510569486619,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"CA\": {\n" +
            "                        \"label\": \"Calcium\",\n" +
            "                        \"quantity\": 517.5791189551354,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"MG\": {\n" +
            "                        \"label\": \"Magnesium\",\n" +
            "                        \"quantity\": 288.2833655524253,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"K\": {\n" +
            "                        \"label\": \"Potassium\",\n" +
            "                        \"quantity\": 2350.8650387501716,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"FE\": {\n" +
            "                        \"label\": \"Iron\",\n" +
            "                        \"quantity\": 25.372466798377037,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"ZN\": {\n" +
            "                        \"label\": \"Zinc\",\n" +
            "                        \"quantity\": 9.121643161845208,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"P\": {\n" +
            "                        \"label\": \"Phosphorus\",\n" +
            "                        \"quantity\": 1771.9387623739244,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"VITA_RAE\": {\n" +
            "                        \"label\": \"Vitamin A\",\n" +
            "                        \"quantity\": 363.9989637732506,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    },\n" +
            "                    \"THIA\": {\n" +
            "                        \"label\": \"Thiamin (B1)\",\n" +
            "                        \"quantity\": 4.514982834138872,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"RIBF\": {\n" +
            "                        \"label\": \"Riboflavin (B2)\",\n" +
            "                        \"quantity\": 3.313624506731033,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"NIA\": {\n" +
            "                        \"label\": \"Niacin (B3)\",\n" +
            "                        \"quantity\": 72.7273096644473,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"VITB6A\": {\n" +
            "                        \"label\": \"Vitamin B6\",\n" +
            "                        \"quantity\": 4.201265675237178,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"FOLDFE\": {\n" +
            "                        \"label\": \"Folate (Equivalent)\",\n" +
            "                        \"quantity\": 1164.081813900471,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    },\n" +
            "                    \"VITB12\": {\n" +
            "                        \"label\": \"Vitamin B12\",\n" +
            "                        \"quantity\": 2.5222239904403687,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    },\n" +
            "                    \"VITD\": {\n" +
            "                        \"label\": \"Vitamin D\",\n" +
            "                        \"quantity\": 2.145999994277954,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    },\n" +
            "                    \"TOCPHA\": {\n" +
            "                        \"label\": \"Vitamin E\",\n" +
            "                        \"quantity\": 7.916877301216126,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    \"VITK1\": {\n" +
            "                        \"label\": \"Vitamin K\",\n" +
            "                        \"quantity\": 20.53283480477333,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    }\n" +
            "                },\n" +
            "                \"totalDaily\": {\n" +
            "                    \"ENERC_KCAL\": {\n" +
            "                        \"label\": \"Energy\",\n" +
            "                        \"quantity\": 138.0759174717665,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"FAT\": {\n" +
            "                        \"label\": \"Fat\",\n" +
            "                        \"quantity\": 109.29727686449198,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"FASAT\": {\n" +
            "                        \"label\": \"Saturated\",\n" +
            "                        \"quantity\": 118.74150442790986,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"CHOCDF\": {\n" +
            "                        \"label\": \"Carbs\",\n" +
            "                        \"quantity\": 115.93843834342161,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"FIBTG\": {\n" +
            "                        \"label\": \"Fiber\",\n" +
            "                        \"quantity\": 67.34740004825592,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"PROCNT\": {\n" +
            "                        \"label\": \"Protein\",\n" +
            "                        \"quantity\": 335.82587952246666,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"CHOLE\": {\n" +
            "                        \"label\": \"Cholesterol\",\n" +
            "                        \"quantity\": 237.3674780591329,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"NA\": {\n" +
            "                        \"label\": \"Sodium\",\n" +
            "                        \"quantity\": 128.27127372860912,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"CA\": {\n" +
            "                        \"label\": \"Calcium\",\n" +
            "                        \"quantity\": 51.757911895513544,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"MG\": {\n" +
            "                        \"label\": \"Magnesium\",\n" +
            "                        \"quantity\": 72.07084138810633,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"K\": {\n" +
            "                        \"label\": \"Potassium\",\n" +
            "                        \"quantity\": 67.16757253571919,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"FE\": {\n" +
            "                        \"label\": \"Iron\",\n" +
            "                        \"quantity\": 140.95814887987243,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"ZN\": {\n" +
            "                        \"label\": \"Zinc\",\n" +
            "                        \"quantity\": 60.810954412301385,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"P\": {\n" +
            "                        \"label\": \"Phosphorus\",\n" +
            "                        \"quantity\": 253.13410891056066,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"VITA_RAE\": {\n" +
            "                        \"label\": \"Vitamin A\",\n" +
            "                        \"quantity\": 40.444329308138954,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"THIA\": {\n" +
            "                        \"label\": \"Thiamin (B1)\",\n" +
            "                        \"quantity\": 300.9988556092581,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"RIBF\": {\n" +
            "                        \"label\": \"Riboflavin (B2)\",\n" +
            "                        \"quantity\": 194.91908863123723,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"NIA\": {\n" +
            "                        \"label\": \"Niacin (B3)\",\n" +
            "                        \"quantity\": 363.63654832223654,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"VITB6A\": {\n" +
            "                        \"label\": \"Vitamin B6\",\n" +
            "                        \"quantity\": 210.0632837618589,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"FOLDFE\": {\n" +
            "                        \"label\": \"Folate (Equivalent)\",\n" +
            "                        \"quantity\": 291.02045347511773,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"VITB12\": {\n" +
            "                        \"label\": \"Vitamin B12\",\n" +
            "                        \"quantity\": 42.03706650733948,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"VITD\": {\n" +
            "                        \"label\": \"Vitamin D\",\n" +
            "                        \"quantity\": 0.5364999985694885,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"TOCPHA\": {\n" +
            "                        \"label\": \"Vitamin E\",\n" +
            "                        \"quantity\": 39.584386506080634,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    },\n" +
            "                    \"VITK1\": {\n" +
            "                        \"label\": \"Vitamin K\",\n" +
            "                        \"quantity\": 25.666043505966663,\n" +
            "                        \"unit\": \"%\"\n" +
            "                    }\n" +
            "                },\n" +
            "                \"digest\": [\n" +
            "                    {\n" +
            "                        \"label\": \"Fat\",\n" +
            "                        \"tag\": \"FAT\",\n" +
            "                        \"schemaOrgTag\": \"fatContent\",\n" +
            "                        \"total\": 71.04322996191979,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 109.29727686449198,\n" +
            "                        \"unit\": \"g\",\n" +
            "                        \"sub\": [\n" +
            "                            {\n" +
            "                                \"label\": \"Saturated\",\n" +
            "                                \"tag\": \"FASAT\",\n" +
            "                                \"schemaOrgTag\": \"saturatedFatContent\",\n" +
            "                                \"total\": 23.748300885581973,\n" +
            "                                \"hasRDI\": true,\n" +
            "                                \"daily\": 118.74150442790986,\n" +
            "                                \"unit\": \"g\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"label\": \"Trans\",\n" +
            "                                \"tag\": \"FATRN\",\n" +
            "                                \"schemaOrgTag\": \"transFatContent\",\n" +
            "                                \"total\": 1.1027634538650513,\n" +
            "                                \"hasRDI\": false,\n" +
            "                                \"daily\": 0.0,\n" +
            "                                \"unit\": \"g\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"label\": \"Monounsaturated\",\n" +
            "                                \"tag\": \"FAMS\",\n" +
            "                                \"schemaOrgTag\": null,\n" +
            "                                \"total\": 24.757730895688535,\n" +
            "                                \"hasRDI\": false,\n" +
            "                                \"daily\": 0.0,\n" +
            "                                \"unit\": \"g\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"label\": \"Polyunsaturated\",\n" +
            "                                \"tag\": \"FAPU\",\n" +
            "                                \"schemaOrgTag\": null,\n" +
            "                                \"total\": 12.321194666113852,\n" +
            "                                \"hasRDI\": false,\n" +
            "                                \"daily\": 0.0,\n" +
            "                                \"unit\": \"g\"\n" +
            "                            }\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Carbs\",\n" +
            "                        \"tag\": \"CHOCDF\",\n" +
            "                        \"schemaOrgTag\": \"carbohydrateContent\",\n" +
            "                        \"total\": 347.81531503026486,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 115.93843834342161,\n" +
            "                        \"unit\": \"g\",\n" +
            "                        \"sub\": [\n" +
            "                            {\n" +
            "                                \"label\": \"Carbs (net)\",\n" +
            "                                \"tag\": \"CHOCDF.net\",\n" +
            "                                \"schemaOrgTag\": null,\n" +
            "                                \"total\": 330.9784650182009,\n" +
            "                                \"hasRDI\": false,\n" +
            "                                \"daily\": 0.0,\n" +
            "                                \"unit\": \"g\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"label\": \"Fiber\",\n" +
            "                                \"tag\": \"FIBTG\",\n" +
            "                                \"schemaOrgTag\": \"fiberContent\",\n" +
            "                                \"total\": 16.83685001206398,\n" +
            "                                \"hasRDI\": true,\n" +
            "                                \"daily\": 67.34740004825592,\n" +
            "                                \"unit\": \"g\"\n" +
            "                            },\n" +
            "                            {\n" +
            "                                \"label\": \"Sugars\",\n" +
            "                                \"tag\": \"SUGAR\",\n" +
            "                                \"schemaOrgTag\": \"sugarContent\",\n" +
            "                                \"total\": 14.411520000076294,\n" +
            "                                \"hasRDI\": false,\n" +
            "                                \"daily\": 0.0,\n" +
            "                                \"unit\": \"g\"\n" +
            "                            }\n" +
            "                        ]\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Protein\",\n" +
            "                        \"tag\": \"PROCNT\",\n" +
            "                        \"schemaOrgTag\": \"proteinContent\",\n" +
            "                        \"total\": 167.91293976123333,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 335.82587952246666,\n" +
            "                        \"unit\": \"g\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Cholesterol\",\n" +
            "                        \"tag\": \"CHOLE\",\n" +
            "                        \"schemaOrgTag\": \"cholesterolContent\",\n" +
            "                        \"total\": 712.1024341773987,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 237.3674780591329,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Sodium\",\n" +
            "                        \"tag\": \"NA\",\n" +
            "                        \"schemaOrgTag\": \"sodiumContent\",\n" +
            "                        \"total\": 3078.510569486619,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 128.27127372860912,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Calcium\",\n" +
            "                        \"tag\": \"CA\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 517.5791189551354,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 51.757911895513544,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Magnesium\",\n" +
            "                        \"tag\": \"MG\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 288.2833655524253,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 72.07084138810633,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Potassium\",\n" +
            "                        \"tag\": \"K\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 2350.8650387501716,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 67.16757253571919,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Iron\",\n" +
            "                        \"tag\": \"FE\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 25.372466798377037,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 140.95814887987243,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Zinc\",\n" +
            "                        \"tag\": \"ZN\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 9.121643161845208,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 60.810954412301385,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Phosphorus\",\n" +
            "                        \"tag\": \"P\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 1771.9387623739244,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 253.13410891056066,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Vitamin A\",\n" +
            "                        \"tag\": \"VITA_RAE\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 363.9989637732506,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 40.444329308138954,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Vitamin C\",\n" +
            "                        \"tag\": \"VITC\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 0.0,\n" +
            "                        \"hasRDI\": false,\n" +
            "                        \"daily\": 0.0,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Thiamin (B1)\",\n" +
            "                        \"tag\": \"THIA\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 4.514982834138872,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 300.9988556092581,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Riboflavin (B2)\",\n" +
            "                        \"tag\": \"RIBF\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 3.313624506731033,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 194.91908863123723,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Niacin (B3)\",\n" +
            "                        \"tag\": \"NIA\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 72.7273096644473,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 363.63654832223654,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Vitamin B6\",\n" +
            "                        \"tag\": \"VITB6A\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 4.201265675237178,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 210.0632837618589,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Folate (Equivalent)\",\n" +
            "                        \"tag\": \"FOLDFE\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 1164.081813900471,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 291.02045347511773,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Vitamin B12\",\n" +
            "                        \"tag\": \"VITB12\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 2.5222239904403687,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 42.03706650733948,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Vitamin D\",\n" +
            "                        \"tag\": \"VITD\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 2.145999994277954,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 0.5364999985694885,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Vitamin E\",\n" +
            "                        \"tag\": \"TOCPHA\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 7.916877301216126,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 39.584386506080634,\n" +
            "                        \"unit\": \"mg\"\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"label\": \"Vitamin K\",\n" +
            "                        \"tag\": \"VITK1\",\n" +
            "                        \"schemaOrgTag\": null,\n" +
            "                        \"total\": 20.53283480477333,\n" +
            "                        \"hasRDI\": true,\n" +
            "                        \"daily\": 25.666043505966663,\n" +
            "                        \"unit\": \"µg\"\n" +
            "                    }\n" +
            "                ]\n" +
            "            },\n" +
            "            \"bookmarked\": false,\n" +
            "            \"bought\": false\n" +
            "        } "+
            "    ] "+
            "}";
}
