def testing(p, exp)
  actual = am_i_wilson(p)
  expect(actual).to be(exp), "Testing for p = #{p}\nexpected: #{exp.inspect}\n     got: #{actual.inspect}"
end

describe "Basic tests" do
  it "Basic test cases" do
    testing(0, false)
    testing(1, false)
    testing(5, true)
    testing(8, false)
    testing(9, false)
  end
end