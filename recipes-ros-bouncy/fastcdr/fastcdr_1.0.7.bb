# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CDR serialization implementation."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cmake"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/1.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2fa2e48286c2d80745426c7616befbc7"
SRC_URI[sha256sum] = "630f24ec498098e340794ea5061043561fb0388fce7e2af3a3614aac0a27cfd1"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-1.0.7-0"

inherit ros
inherit cmake


