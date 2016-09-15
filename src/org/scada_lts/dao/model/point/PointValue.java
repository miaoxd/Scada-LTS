/*
 * (c) 2015 Abil'I.T. http://abilit.eu/
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of 
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package org.scada_lts.dao.model.point;

import com.serotonin.mango.rt.dataImage.PointValueTime;

/** 
 * Bean 
 * 
 * @author grzegorz bylica Abil'I.T. development team, sdt@abilit.eu
 * 
 */
public class PointValue {
	
	private long id;
	private long dataPointId;
	//TODO rewrite type
	private PointValueTime pointValue;
	
	public PointValue() {
		
	}
		
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getDataPointId() {
		return dataPointId;
	}
	public void setDataPointId(long dataPointId) {
		this.dataPointId = dataPointId;
	}
	public PointValueTime getPointValue() {
		return pointValue;
	}
	public void setPointValue(PointValueTime pointValue) {
		this.pointValue = pointValue;
	}

}
