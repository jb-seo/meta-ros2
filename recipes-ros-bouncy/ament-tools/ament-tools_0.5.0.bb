# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The command line tools for the ament buildsystem."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-package osrf-pycommon python3-catkin-pkg"
SRC_URI = "https://github.com/ros2-gbp/ament_tools-release/archive/release/bouncy/ament_tools/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8d630b31df9c9f94ba3133112714a350"
SRC_URI[sha256sum] = "901b651e78cf587f1a1fca070e43e902092839dd9dc8cb6cc758c0c55885dd48"
S = "${WORKDIR}/ament_tools-release-release-bouncy-ament_tools-0.5.0-0"

inherit ros
inherit setuptools3


BBCLASSEXTEND += "native"