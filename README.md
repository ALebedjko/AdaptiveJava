

public IntelliJKey useIntelliJIdeaUltimateKey() {
    IntelliJKey licenseKey;
    if (!enoughMoneyForPurchase(this.getMoney)) {
        Login stepikLogin = registerOnStepikOrg();
        signInITCourse(stepikLogin);
        learnFirstLesson(stepikLogin);
        licenseKey = getIntelliJLicenseOnAllProductFor2Month(stepikLogin);
    } else
       licenseKey = buyUltimateVersion();
    useAllNeededIntelliJProduct(licenseKey);
    return licenseKey;
}

