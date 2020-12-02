package com.zhouhc.chapter02;

/*
 *VM Args -Xss128k
 *
 */
//无限制调用方法，这里主要测试局部变量太多导致栈溢出的情况
public class JavaVmStackSOF_2 {

    private int stactLength = 1;

    //无限制的递归调用
    public void stackLeak() {
        long unsed1, unsed2, unsed3, unsed4,
                unsed5, unsed6, unsed7, unsed8,
                unsed9, unsed10, unsed11, unsed12,
                unsed13, unsed14, unsed15, unsed16,
                unsed17, unsed18, unsed19, unsed20,
                unsed21, unsed22, unsed23, unsed24,
                unsed25, unsed26, unsed27, unsed28,
                unsed29, unsed30, unsed31, unsed32,
                unsed33, unsed34, unsed35, unsed36,
                unsed37, unsed38, unsed39, unsed40,
                unsed41, unsed42, unsed43, unsed44,
                unsed45, unsed46, unsed47, unsed48,
                unsed49, unsed50, unsed51, unsed52,
                unsed53, unsed54, unsed55, unsed56,
                unsed57, unsed58, unsed59, unsed60,
                unsed61, unsed62, unsed63, unsed64,
                unsed65, unsed66, unsed67, unsed68,
                unsed69, unsed70, unsed71, unsed72,
                unsed73, unsed74, unsed75, unsed76,
                unsed77, unsed78, unsed79, unsed80,
                unsed81, unsed82, unsed83, unsed84,
                unsed85, unsed86, unsed87, unsed88,
                unsed89, unsed90, unsed91, unsed92,
                unsed93, unsed94, unsed95, unsed96,
                unsed97, unsed98, unsed99, unsed100;
        stactLength++;
        stackLeak();

        unsed1 = unsed2 = unsed3 = unsed4 = unsed5 = unsed6 = unsed7 = unsed8 = unsed9 = unsed10 = unsed11 = unsed12 = unsed13 = unsed14 = unsed15 = unsed16 = unsed17 = unsed18 = unsed19 = unsed20 = unsed21 = unsed22 = unsed23 = unsed24 = unsed25 = unsed26 = unsed27 = unsed28 = unsed29 = unsed30 = unsed31 = unsed32 = unsed33 = unsed34 = unsed35 = unsed36 = unsed37 = unsed38 = unsed39 = unsed40 = unsed41 = unsed42 = unsed43 = unsed44 = unsed45 = unsed46 = unsed47 = unsed48 = unsed49 = unsed50 = unsed51 = unsed52 = unsed53 = unsed54 = unsed55 = unsed56 = unsed57 = unsed58 = unsed59 = unsed60 = unsed61 = unsed62 = unsed63 = unsed64 = unsed65 = unsed66 = unsed67 = unsed68 = unsed69 = unsed70 = unsed71 = unsed72 = unsed73 = unsed74 = unsed75 = unsed76 = unsed77 = unsed78 = unsed79 = unsed80 = unsed81 = unsed82 = unsed83 = unsed84 = unsed85 = unsed86 = unsed87 = unsed88 = unsed89 = unsed90 = unsed91 = unsed92 = unsed93 = unsed94 = unsed95 = unsed96 = unsed97 = unsed98 = unsed99 = unsed100 = 0L;
    }

    public static void main(String[] args) throws Throwable {
        JavaVmStackSOF_2 stackSOF_2 = new JavaVmStackSOF_2();
        //主要是为了打印栈的深度
        try {
            stackSOF_2.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length :" + stackSOF_2.stactLength);
            throw e;
        }
    }
}
