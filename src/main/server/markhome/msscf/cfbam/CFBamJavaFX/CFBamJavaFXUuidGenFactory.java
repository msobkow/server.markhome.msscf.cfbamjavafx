// Description: Java 11 JavaFX Display Element Factory for UuidGen.

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
 *	CFBamJavaFXUuidGenFactory JavaFX Display Element Factory
 *	for UuidGen.
 */
public class CFBamJavaFXUuidGenFactory
implements ICFBamJavaFXUuidGenFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXUuidGenFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamUuidGenObj argFocus ) {
		CFBamJavaFXUuidGenAttrPane retnew = new CFBamJavaFXUuidGenAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamUuidGenObj argFocus,
		Collection<ICFBamUuidGenObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXUuidGenListPane retnew = new CFBamJavaFXUuidGenListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamUuidGenObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamUuidGenObj> argDataCollection,
		ICFBamJavaFXUuidGenChosen whenChosen )
	{
		CFBamJavaFXUuidGenPickerPane retnew = new CFBamJavaFXUuidGenPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamUuidGenObj argFocus ) {
		CFBamJavaFXUuidGenEltTabPane retnew = new CFBamJavaFXUuidGenEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamUuidGenObj argFocus ) {
		CFBamJavaFXUuidGenAddPane retnew = new CFBamJavaFXUuidGenAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamUuidGenObj argFocus ) {
		CFBamJavaFXUuidGenViewEditPane retnew = new CFBamJavaFXUuidGenViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamUuidGenObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXUuidGenAskDeleteForm retnew = new CFBamJavaFXUuidGenAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamUuidGenObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamUuidGenObj> argDataCollection,
		ICFBamJavaFXUuidGenChosen whenChosen )
	{
		CFBamJavaFXUuidGenPickerForm retnew = new CFBamJavaFXUuidGenPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamUuidGenObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXUuidGenAddForm retnew = new CFBamJavaFXUuidGenAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamUuidGenObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXUuidGenViewEditForm retnew = new CFBamJavaFXUuidGenViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
