@test.describe('Fixed Tests')
def fixed_tests():

    @test.it('Basic Test Cases')
    def basic_tests():
        test.assert_equals(solve(1),-1)
        test.assert_equals(solve(2),-1)
        test.assert_equals(solve(3),1)
        test.assert_equals(solve(4),-1)
        test.assert_equals(solve(5),4)
        test.assert_equals(solve(7),9)
        test.assert_equals(solve(8),1)
        test.assert_equals(solve(9),16)
        test.assert_equals(solve(10),-1)
        test.assert_equals(solve(11),25)
        test.assert_equals(solve(13),36)
        test.assert_equals(solve(17),64)
        test.assert_equals(solve(88901),5428900)
        test.assert_equals(solve(290101),429235524)
