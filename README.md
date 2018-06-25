# TeaTime Code

This is a exercise repository for the TeaTime example app which is part of Udacity's Advanced Android course. TeaTime is a mock tea ordering app that demonstrates various uses of the Espresso Testing framework (i.e. Views, AdapterViews, Intents, IdlingResources).

The second commit provides espresso testing code for an adapter view (specifically GridView). The espresso test mirrors a user clicking on a tea item in the GridView in the MenuActivity and then checks to see that the appropriate corresponding tea name is the header on the OrderActivity screen that follows. In this code, a specific position is chosen to check this correspondence (here position zero should correspond to "Black Tea"). This code also has a user defined helper matcher function that is placed here for reference but is not actually needed/used in the implementation.

This third commit provides espresso testing code for an intent that emails a preset statement using the Android gmail app or another fallback app.  The espresso code stubs all external intents and catches the intent the "SENDTO" intent, checking its action (ACTION_SENDTO), extras (text), and its package (Google gmail).