package com.wz.behavioral.memento;

/**
 * @author 隔壁老王
 * @create 2020-05-08 7:36
 * @description
 */
//管理者角色：被备忘录角色进行管理，只能保存于获取，不能修改和访问
public class GameCaretaker {
    private GameRoleMemento gameRoleMemento;

    public void setGameRoleMemento(GameRoleMemento gameRoleMemento) {
        this.gameRoleMemento = gameRoleMemento;
    }

    public GameRoleMemento getGameRoleMemento() {
        return gameRoleMemento;
    }
}
