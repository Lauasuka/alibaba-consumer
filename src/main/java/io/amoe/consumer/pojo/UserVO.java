package io.amoe.consumer.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.NumberFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Amoe
 */
@Data
public class UserVO implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private String phone;
    @NumberFormat(pattern="#,###,###,###.##", style = NumberFormat.Style.CURRENCY)
    private BigDecimal wallet;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;
}
