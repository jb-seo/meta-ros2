# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check source files for copyright and license     information."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=ee09441fd2874bd55740e281e9f11b69"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_copyright/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e70cfc0110617460ca30e7ec30b32274"
SRC_URI[sha256sum] = "913ec5e7dbde6e7c7308f23909737ae06e4d4dc5da407a79722ff9153d8e50d8"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_copyright-0.5.2-0"


inherit ros
inherit setuptools3

BBCLASSEXTEND += "native"