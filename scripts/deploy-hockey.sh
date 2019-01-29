#!/bin/sh

# upload apk to hockey app
#curl \
#-F "status=2" \
#-F "notify=0" \
#-F "ipa=@app/build/outputs/apk/release/app-release.apk" \
#-H "X-HockeyAppToken: $HOCKEY_APP_TOKEN" \
#https://rink.hockeyapp.net/api/2/apps/$HOCKEY_APP_ID/app_versions/upload

curl \
-F "ipa=@app/build/outputs/apk/release/app-release.apk" \
https://rink.hockeyapp.net/api/sonoma/apps/b4c38114-d2e2-480e-a3da-ccf1d28d0315/app_versions/upload?upload_id=a271a420-061a-0137-328a-061f30a48c6e