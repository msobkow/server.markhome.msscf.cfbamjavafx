// Description: Java 11 JavaFX Pane Common Interface for Scope.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamJavaFX;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	ICFBamJavaFXScopePaneList JavaFX Interface
 *	for Scope data collections.  It is presumed that the
 *	JavaFXFocus is the currently selected single member of
 *	the collection associated with this list view, or null
 *	if no element has been selected from the data collection..
 */
public interface ICFBamJavaFXScopePaneList
extends
	ICFBamJavaFXScopePaneCommon,
	ICFPaneList<ICFLibAnyObj,ICFBamScopeObj>
{
}
