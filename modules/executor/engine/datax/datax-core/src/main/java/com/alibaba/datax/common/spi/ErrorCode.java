package com.alibaba.datax.common.spi;

/**
 * 尤其注意：最好提供toString()实现。例如：
 * <p>
 * <pre>
 *
 * &#064;Override
 * static String toString() {
 * 	return String.format(&quot;Code:[%s], Description:[%s]. &quot;, this.code, this.describe);
 * }
 * </pre>
 */
public interface ErrorCode {
    // 错误码编号
    String getCode();

    // 错误码描述
    String getDescription();

    /**
     * 必须提供toString的实现
     * <p>
     * <pre>
     * &#064;Override
     * static String toString() {
     * 	return String.format(&quot;Code:[%s], Description:[%s]. &quot;, this.code, this.describe);
     * }
     * </pre>
     */
    @Override
    String toString();
}