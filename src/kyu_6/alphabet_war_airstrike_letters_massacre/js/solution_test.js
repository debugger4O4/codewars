const Test = require('@codewars/test-compat');

describe("Tests", () => {
    it("test", () => {
        Test.assertEquals( alphabetWar("z") , "Right side wins!" );
        Test.assertEquals( alphabetWar("****") , "Let's fight again!" );
        Test.assertEquals( alphabetWar("z*dq*mw*pb*s"), "Let's fight again!" );
        Test.assertEquals( alphabetWar("zdqmwpbs"), "Let's fight again!" );
        Test.assertEquals( alphabetWar("zz*zzs"), "Right side wins!" );
        Test.assertEquals( alphabetWar("sz**z**zs"), "Left side wins!" );
        Test.assertEquals( alphabetWar("z*z*z*zs"), "Left side wins!" );
        Test.assertEquals( alphabetWar("*wwwwww*z*"), "Left side wins!" );

    });
});
