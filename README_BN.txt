R GAMING JONE BD — Android APK Project
======================================

এই প্রজেক্টে ১৫টি Offline mini-game-এর playable সংস্করণ রয়েছে। এগুলো ছোট arcade-style game, PUBG-এর মতো full 3D বা online multiplayer নয়।

গেমের তালিকা:
1. Battle Royale — 2D survival arena, move + fire
2. Car Racing — lane dodge racing
3. Zombie Survival — tap the zombies
4. Football Challenge — penalty kick
5. Sniper Mission — moving target practice
6. Bike Racing — lane dodge racing
7. Shadow Fight — punch/kick/block combat
8. Bubble Shooter — adjacent matching bubbles
9. Endless Run — jump over obstacles
10. Car Parking — steer into parking bay
11. Chess Master — playable basic board movement (full chess rules/AI নেই)
12. Fruit Slicer — tap fruit arcade
13. Air Combat — obstacle-dodge flight mini-game
14. 8 Ball Pool — tap-to-pocket casual pool mini-game
15. Monster Truck — obstacle-dodge stunt drive

ফোনে APK বানানোর নিয়ম (GitHub):
1. এই ZIP Extract করুন।
2. GitHub-এ নতুন Public বা Private Repository খুলুন।
3. Extract করা ফোল্ডারের ভেতরের সব ফাইল Repository-র root-এ upload করুন।
   লক্ষ্য রাখবেন: .github ফোল্ডারটিও upload হতে হবে।
4. GitHub-এর Actions tab খুলুন।
5. “Build R Gaming Jone BD APK” workflow নির্বাচন করুন।
6. “Run workflow” চাপুন।
7. Build সফল হলে workflow run-এর নিচের Artifacts থেকে R-Gaming-Jone-BD-APK ডাউনলোড করুন।
8. ZIP extract করে app-debug.apk ফোনে install করুন। প্রথমবার Android Settings থেকে Chrome/GitHub-এর জন্য “Install unknown apps” অনুমতি দিতে হতে পারে।

নোট:
- এটি Android WebView wrapper; গেমগুলো app-এর ভেতরে local HTML/JavaScript থেকে চলে, তাই গেম খেলার জন্য ইন্টারনেট লাগে না।
- এটি APK build করার source project, সরাসরি APK ফাইল নয়। GitHub Actions APK তৈরি করবে।
- AdMob এখনো যুক্ত করা হয়নি। আসল AdMob চালুর আগে নিজের AdMob account, app registration, এবং বিজ্ঞাপন unit ID প্রয়োজন। ভুয়া বিজ্ঞাপন বা নিজের বিজ্ঞাপনে ক্লিক করা যাবে না।
- Package: com.royalgaming.app
