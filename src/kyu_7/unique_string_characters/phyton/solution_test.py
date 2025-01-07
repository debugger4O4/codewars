@test.describe('Fixed Tests')
def fixed_tests():

    @test.it('Basic Test Cases')
    def basic_tests():
        test.assert_equals(solve("xyab","xzca"),"ybzc")
        test.assert_equals(solve("xyabb","xzca"),"ybbzc")
        test.assert_equals(solve("abcd","xyz"),"abcdxyz")
        test.assert_equals(solve("xxx","xzca"),"zca")