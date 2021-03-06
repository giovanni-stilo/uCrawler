package it.stilo.ucrawler.actions.extraction.flexible.textops;

/*
 * #%L
 * uCrawler
 * %%
 * Copyright (C) 2012 - 2018 Giovanni Stilo
 * %%
 * uCrawler is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program.  If not, see
 * <https://www.gnu.org/licenses/lgpl-3.0.txt>.
 * #L%
 */

/**
 *
 * @author stilo
 */
public class TimeToDate implements PerformerIF {

	@Override
	public Object performOp(Object obj) throws PerformerException {
		if (obj == null)
			return null;
		try {
			//return new Date(Long.parseLong(obj.toString()));
			return Long.parseLong(obj.toString());
		} catch (Exception e) {
			throw new PerformerException(e);
		}
	}

}
