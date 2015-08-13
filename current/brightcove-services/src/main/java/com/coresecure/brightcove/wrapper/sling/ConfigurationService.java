/*
    Adobe CQ5 Brightcove Connector

    Copyright (C) 2015 Coresecure Inc.

        Authors:    Alessandro Bonfatti
                    Yan Kisen

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.coresecure.brightcove.wrapper.sling;


import java.util.List;

public interface ConfigurationService {

    
    public String getReadToken();
    public String getWriteToken();
    public String getPreviewPlayerLoc();
	public String getPreviewPlayerListLoc();
    public String getPlayersLoc();
    public String getDefVideoPlayerID();
	public String getDefVideoPlayerDataEmbedded();
	public String getDefPlaylistPlayerID();
	public String getDefPlaylistPlayerKey();
    public String getClientID();
    public String getClientSecret();
    public String getAccountID();
    public String getAccountAlias();
    public List<String> getAllowedGroupsList();
    public String[] getAllowedGroups();
}
