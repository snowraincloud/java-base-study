package creational.builder;

import edu.wbu.pattern.creational.factory.common.AbstractComputer;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <h1>计算机默认实现</h1>
 * <p>
 *     实现变种Builder模式<br>
 *     通过链式调用生成不同的配置
 * </p>
 * @author wangjunhao
 **/
@NoArgsConstructor
@ToString(callSuper = true)
public class Computer extends AbstractComputer {

    public Computer(String brand, String cpu, String mainBoard, String display, int ram, int hardDisk) {
        this.brand = brand;
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.display = display;
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    private Computer(Builder builder){
        this.brand = builder.brand;
        this.cpu = builder.cpu;
        this.mainBoard = builder.mainBoard;
        this.ram = builder.ram;
        this.display = builder.display;
        this.hardDisk = builder.hardDisk;
    }

    /**
     * <h2>变种builder模式</h2>
     */
    public static final class Builder{
        private String brand;
        private String cpu;
        private String mainBoard;
        private String display;
        private int ram;
        private int hardDisk;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder mainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public Builder display(String display) {
            this.display = display;
            return this;
        }

        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder hardDisk(int hardDisk) {
            this.hardDisk = hardDisk;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
