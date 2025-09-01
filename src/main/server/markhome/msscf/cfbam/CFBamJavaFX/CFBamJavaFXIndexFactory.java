// Description: Java 11 JavaFX Display Element Factory for Index.

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
 *	CFBamJavaFXIndexFactory JavaFX Display Element Factory
 *	for Index.
 */
public class CFBamJavaFXIndexFactory
implements ICFBamJavaFXIndexFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXIndexFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamIndexObj argFocus ) {
		CFBamJavaFXIndexAttrPane retnew = new CFBamJavaFXIndexAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamIndexObj argFocus,
		Collection<ICFBamIndexObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXIndexListPane retnew = new CFBamJavaFXIndexListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamIndexObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamIndexObj> argDataCollection,
		ICFBamJavaFXIndexChosen whenChosen )
	{
		CFBamJavaFXIndexPickerPane retnew = new CFBamJavaFXIndexPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamIndexObj argFocus ) {
		CFBamJavaFXIndexEltTabPane retnew = new CFBamJavaFXIndexEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamIndexObj argFocus ) {
		CFBamJavaFXIndexAddPane retnew = new CFBamJavaFXIndexAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamIndexObj argFocus ) {
		CFBamJavaFXIndexViewEditPane retnew = new CFBamJavaFXIndexViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamIndexObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXIndexAskDeleteForm retnew = new CFBamJavaFXIndexAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamIndexObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamIndexObj> argDataCollection,
		ICFBamJavaFXIndexChosen whenChosen )
	{
		CFBamJavaFXIndexPickerForm retnew = new CFBamJavaFXIndexPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamIndexObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXIndexAddForm retnew = new CFBamJavaFXIndexAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamIndexObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXIndexViewEditForm retnew = new CFBamJavaFXIndexViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
