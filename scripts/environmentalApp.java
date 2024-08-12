public class EnvironmentalService{
    public static void main(String arg[]){

        continueAsGuest(Boolean)
        login(Boolean)
        airQuality(int)
        waterQuality(int)
        forestQuality(int)
        prediction(String)
        subscribe(Boolean)
        logout(Boolean)
        exitApp(Boolean)

    }
}
private Boolean continueAsGuest(Boolean guest){
    if guest = True:
    return True
    if guest = False:
    return False
}
private Boolean login(String Username, String Password){
    validateUsername()
    validatePassword()
    if(validateUsername = True && validatePassword = True){
        return True
    }
    else{
        return False
    }
}
private Int airQuality(){
    getAirQualityFromProbe(){
        return airQualityRaw
    }
    readableAir(airQualityRaw){
        return int readableAir(airQualityRaw)
    }
}
private Int waterQuality(){
    getWaterQualityFromProbe(){
        return waterQualityRaw
    }
    readableWater(waterQualityRaw) {
        return int readableWater(waterQualityRaw)
    }
}
private Int forestQuality(){
    getForestQualityFromProbe() {
        return forestQualityRaw
    }
    readableForest(forestQualityRaw) {
        return int readableForest(forestQualityRaw)
    }
}
private String prediction(){
    getAirQualityFromProbe(){
        return airQualityRaw
    }
    getWaterQualityFromProbe(){
        return waterQualityRaw
    }
    getForestQualityFromProbe(){
        return forestQualityRaw
    }
    generatePrediction(airQualityRaw, waterQualityRaw, forestQualityRaw) {
        //generate prediction algorithm
        readableAir(predictedAirQualityRaw){
            return int readableAir(predictedForestQualityRaw)
        }
        readableWater(predictedWaterQualityRaw){
            return int readableWater(predictedWaterQualityRaw)
        }
        readableForest(predictedForestQualityRaw){
            return int readableForest(predictedForestQualityRaw)
        }
        return String generatePrediction(readableAir + readableWater + readableForest)
    }
    private Boolean subscribe(Boolean subscribeYesOrNo){
        if subscribeYesOrNo = True {
            getUserUsername(username)
            getUserUsernameVerify(username)
            getUserPassword(password)
            getUserPasswordVerify(password)
            if (getUserUsername == getUserUsernameVerify) && (getUserPassword == getUserPasswordVerify){
                return True
            }
		else{
                return False
            }
	else{
                return False
            }
        }

        private Boolean logout(Boolean logoutYesOrNo){
            if logoutYesOrNo = True {
                removeUsername()
                removePassword()
            }
            return True
	else{
                return False
            }

            private Boolean exitApp(Boolean exitAppYesOrNo){
                if exitAppYesOrNo = True {
                    closeApplication()
                }
                return True
	else{
                    return False
                }

