/*
* Copyright (C) 2022 Optic_Fusion1
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package optic_fusion1.kitsune.parser.vbs.domain;

import java.util.ArrayList;
import java.util.List;
import optic_fusion1.kitsune.parser.vbs.interfaces.IContainer;
import optic_fusion1.kitsune.parser.vbs.StatementFilter;
import optic_fusion1.kitsune.parser.vbs.util.Utils;

public class LoopStatement extends Statement implements IContainer {

    private List<IContainer> childContainers = new ArrayList<>();
    private List<Statement> statements = new ArrayList<>();
    private String condition;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public Class<?> getType() {
        return this.getClass();
    }

    @Override
    public List<IContainer> getChildContainers() {
        return childContainers;
    }

    @Override
    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public List<Statement> filterStatements(StatementFilter filter) {
        return Utils.filterStatements(statements, filter);
    }
}
