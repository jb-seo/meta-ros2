# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A configuration package defining the default ROS interface generators."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/rosidl_defaults-release/archive/release/bouncy/rosidl_default_generators/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "15c0067328ea78651a13f136467a3e7c"
SRC_URI[sha256sum] = "994e18bf5ca2a8e03de914817ae3cbf099d439df4844d6d7f9eddbd184b37240"
S = "${WORKDIR}/rosidl_defaults-release-release-bouncy-rosidl_default_generators-0.5.0-0"


inherit ros
inherit ament

