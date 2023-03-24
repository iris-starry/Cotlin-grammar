fun main(args : Array<String>){
    //작은따옴표를 이용해 Char 타입의 값 표시
    var c: Char ='C'
    var ga: Char = '가'

    //var c@ = 'CA'
    println(c)

    println(c.toInt())
    println(ga.toInt())

    //큰따옴표를 이용해 문자열 타입의 값 표시
    var str: String = "Hello!"
    var greet: String = "안녕하세요."

    println(str)
    println(greet)

    //이스케이프 문자
    var strWithExcapes = "안녕하세요. \n반갑습니다.\t^^"
    println(strWithExcapes)

    //Raw String 활용
    var raw = """안녕하세요.
        
        문자열 안에 엔터나 스 페 이 스 탭을 자유롭게 사용할 수 
        있습니다.
        
        끝"""
    println(raw)

    //문자열 템플릿 기능 활용
    // 변수값 = $ 계산식의 결괏값 : $+{}or()
    var num1 = 100
    var num2 = 200

    val strWithNum = "Hello, $num1"
    println(strWithNum)

    var greeting = "\n\t Hello \t\n"
    var trimmed = "trimmed : ${greeting.trim()}"
    println(trimmed)

    var sum = "sum : ${num1 + num2}"
    println(sum)

    //불리안 변수 선언
    var b1 = true
    var b2 = false

    //배열 선언 밎 접근

    //배열 초깃값을 100으로 하는 3가지의 정수를 저장할 수 있는 배열 선언
    var arrInitHundred = Array(3){100}

    //배열에 담긴 첫 번째 값 출력(배열 초깃값을 100으로 지정했으므로 100을 출력)
    println(arrInitHundred[0])
    //배열에 담긴 두 번째 값 출력(배열 초깃값으로 100으로 지정했으므로 100을 출력)
    println(arrInitHundred[1])
    arrInitHundred[2] = 200
    //배열에 담긴 세 번째 값 출력 (단, 200으로 값을 변경했으므로 200을 출력)
    println(arrInitHundred[2])

    //arrayOf 함수를 활용한 초깃값 설정
    var arr2 = arrayOf(100,200,300)
    println(arr2[0])
    println(arr2[1])
    println(arr2[2])

    //Any 타입 변수 선언 및 여러 타입의 값 대입

    //Any 타입 변수 선언
    var anyValue: Any

    //숫자 대입
    anyValue = 100
    //타입 출력
    println(anyValue::class.simpleName)

    //문자열 대입
    anyValue = "Hello"
    println(anyValue::class.simpleName)

    //숫자(실수형 타입) 대입
    anyValue = 1.234
    println(anyValue::class.simpleName)

    //Any 타입 배열을 선언하면 모든 종류의 값을 저장할 수 있음
    var anyTypeArr: Array<Any> = arrayOf(1, 1.234, "Hello")

    //타입을 변환할 변수 선언
    var byteValue: Byte = 65
    println(byteValue)

    //Int, short, Long, Float, Double 타입으로 각기 변환하는 메서드를 호출
    var intValue:Int = byteValue.toInt()
    println(intValue)
    var shortValue:Short = byteValue.toShort()
    println(shortValue)
    var longValue:Long = byteValue.toLong()
    println(longValue)
    var floatValue:Float = byteValue.toFloat()
    println(floatValue)
    var doubleValue:Double = byteValue.toDouble()
    println(doubleValue)

    //글자 타입인 Char 타입으로 변환. 65는 문자 'A'에 대응되는 숫자이므로 charValue 변수에는 'A'문자가 저장됨
    var charValue:Char = byteValue.toChar()
    //A출력
    println(charValue)

    //코틀린 언어 자동 타입 변환을 지원하지 않습니다.

    //숫자가 담긴 문자열을 숫자 타입의 값으로 변환
    var intString = "1234"
    var doubleString = "1.234"

    var stringtoInt = intString.toInt()
    var stringToDobule = doubleString.toDouble()

    println(stringtoInt)
    println(stringToDobule)

    //null 값 대입을 허용하지 않는 타입 선언

    //기본적으로 null 값 대입을 혀용하지 않는 타입(Int)으로 선언
    var num = 100
    //null 값 대입 불가('NUll can not be value of a non-null type Int' 오류 발생)
    //num = null 오류 발생

    //null을 대입받을 수 있는 Int? 타입의 변수를 선언
    var a: Int? = 100
    //null 값 대입 가능
    a = null

    //엘비스 연산자 : 연산자 왼쪽의 피연산자가 null이 아닐 경우 해당 값을 반환하고 null일 경우 오른쪽 피연산자를 반환합니다.

    //왼쪽 피연산자의 값이 null이므로 오른쪽 피연산자(1)를 반환
    var one = null ?: 1
    println(one)
    //왼쪽 피연산자의 값이 null이 아니므로 왼쪽 피연산자(2)를 그대로 반환
    var two = 2 ?: 1
    println(two)

    //엘비스 연산자를 이용한 null 허용 타입의 값에 접근
    var b: String? = null

    //만약 c가 null이 아니라면 length 속성값을 반환하고, c가 null이라면 대안으로 사용할 값인 0을 반환
    var result = b?.length ?: 0

    println(result)
}