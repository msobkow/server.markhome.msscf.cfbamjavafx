// Description: Java 11 JavaFX Display Element Factory for DoubleCol.

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
 *	CFBamJavaFXDoubleColFactory JavaFX Display Element Factory
 *	for DoubleCol.
 */
public class CFBamJavaFXDoubleColFactory
implements ICFBamJavaFXDoubleColFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXDoubleColFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamDoubleColObj argFocus ) {
		CFBamJavaFXDoubleColAttrPane retnew = new CFBamJavaFXDoubleColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamDoubleColObj argFocus,
		Collection<ICFBamDoubleColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXDoubleColListPane retnew = new CFBamJavaFXDoubleColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamDoubleColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamDoubleColObj> argDataCollection,
		ICFBamJavaFXDoubleColChosen whenChosen )
	{
		CFBamJavaFXDoubleColPickerPane retnew = new CFBamJavaFXDoubleColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamDoubleColObj argFocus ) {
		CFBamJavaFXDoubleColEltTabPane retnew = new CFBamJavaFXDoubleColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamDoubleColObj argFocus ) {
		CFBamJavaFXDoubleColAddPane retnew = new CFBamJavaFXDoubleColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamDoubleColObj argFocus ) {
		CFBamJavaFXDoubleColViewEditPane retnew = new CFBamJavaFXDoubleColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamDoubleColObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXDoubleColAskDeleteForm retnew = new CFBamJavaFXDoubleColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamDoubleColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamDoubleColObj> argDataCollection,
		ICFBamJavaFXDoubleColChosen whenChosen )
	{
		CFBamJavaFXDoubleColPickerForm retnew = new CFBamJavaFXDoubleColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamDoubleColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXDoubleColAddForm retnew = new CFBamJavaFXDoubleColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamDoubleColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXDoubleColViewEditForm retnew = new CFBamJavaFXDoubleColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
