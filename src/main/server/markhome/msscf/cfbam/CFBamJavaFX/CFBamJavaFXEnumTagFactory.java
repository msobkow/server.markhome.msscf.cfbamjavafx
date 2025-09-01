// Description: Java 11 JavaFX Display Element Factory for EnumTag.

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
 *	CFBamJavaFXEnumTagFactory JavaFX Display Element Factory
 *	for EnumTag.
 */
public class CFBamJavaFXEnumTagFactory
implements ICFBamJavaFXEnumTagFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXEnumTagFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamEnumTagObj argFocus ) {
		CFBamJavaFXEnumTagAttrPane retnew = new CFBamJavaFXEnumTagAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamEnumDefObj argContainer,
		ICFBamEnumTagObj argFocus,
		Collection<ICFBamEnumTagObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXEnumTagListPane retnew = new CFBamJavaFXEnumTagListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamEnumTagObj argFocus,
		ICFBamEnumDefObj argContainer,
		Collection<ICFBamEnumTagObj> argDataCollection,
		ICFBamJavaFXEnumTagChosen whenChosen )
	{
		CFBamJavaFXEnumTagPickerPane retnew = new CFBamJavaFXEnumTagPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamEnumTagObj argFocus ) {
		CFBamJavaFXEnumTagEltTabPane retnew = new CFBamJavaFXEnumTagEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamEnumTagObj argFocus ) {
		CFBamJavaFXEnumTagAddPane retnew = new CFBamJavaFXEnumTagAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamEnumTagObj argFocus ) {
		CFBamJavaFXEnumTagViewEditPane retnew = new CFBamJavaFXEnumTagViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamEnumTagObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXEnumTagAskDeleteForm retnew = new CFBamJavaFXEnumTagAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamEnumTagObj argFocus,
		ICFBamEnumDefObj argContainer,
		Collection<ICFBamEnumTagObj> argDataCollection,
		ICFBamJavaFXEnumTagChosen whenChosen )
	{
		CFBamJavaFXEnumTagPickerForm retnew = new CFBamJavaFXEnumTagPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamEnumTagObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXEnumTagAddForm retnew = new CFBamJavaFXEnumTagAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamEnumTagObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXEnumTagViewEditForm retnew = new CFBamJavaFXEnumTagViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
