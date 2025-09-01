// Description: Java 11 JavaFX Display Element Factory Interface for BlobCol.

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
 *	ICFBamJavaFXBlobColFactory JavaFX Display Element Factory Interface
 *	for BlobCol.
 */
public interface ICFBamJavaFXBlobColFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamBlobColObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamBlobColObj argFocus,
		Collection<ICFBamBlobColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamBlobColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamBlobColObj> argDataCollection,
		ICFBamJavaFXBlobColChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamBlobColObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamBlobColObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamBlobColObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamBlobColObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamBlobColObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamBlobColObj> argDataCollection,
		ICFBamJavaFXBlobColChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamBlobColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamBlobColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
