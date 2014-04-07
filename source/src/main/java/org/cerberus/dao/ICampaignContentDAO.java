/*
 * Cerberus  Copyright (C) 2013  vertigo17
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This file is part of Cerberus.
 *
 * Cerberus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Cerberus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Cerberus.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.cerberus.dao;

import java.util.List;
import org.cerberus.entity.CampaignContent;
import org.cerberus.exception.CerberusException;

/**
 *
 * @author memiks
 */
public interface ICampaignContentDAO {


    List<CampaignContent> findAll() throws CerberusException;

    CampaignContent findCampaignContentByKey(Integer campaignID) throws CerberusException;

    List<CampaignContent> findCampaignContentByCampaignName(String campaign) throws CerberusException;

    List<CampaignContent> findCampaignContentsByTestBattery(String testBattery) throws CerberusException;

    boolean updateCampaignName(CampaignContent campaign);

    boolean updateTestBattery(CampaignContent campaign);

    boolean createCampaignContent(CampaignContent campaign);

    List<CampaignContent> findCampaignContentByCriteria(String campaign, Integer campaignContentID, String testBattery) throws CerberusException;

//    List<String> findUniqueDataOfColumn(String column);
}
