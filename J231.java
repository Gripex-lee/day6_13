package day6_13;

public class J231 {
	public static void main(String[] args) {
		//String
		String appendStr = "";// 创建字符串变量
        long startTime = System.nanoTime();// 开始记时
        for (int i = 20000; i < 50000; i++) {// 遍历30000个字符
            appendStr += (char) i;// 字符串与每个字符执行连接操作
        }
        long endTime = System.nanoTime();// 结束计时
        System.out.println("String用时：" + (endTime - startTime) / 1000000d + "毫秒");
        //StringBuilder
        StringBuilder strBuilder = new StringBuilder();// 创建字符串构建器
        startTime = System.nanoTime();// 开始计时
        for (int i = 20000; i < 50000; i++) {// 遍历30000个字符
            strBuilder.append((char) i);// 把每个字符追加到构建器
        }
        endTime = System.nanoTime();// 结束记时
        // 输出用时
        System.out.println("StringBuilder用时：" + (endTime - startTime) / 1000000d + "毫秒");
	}
}
