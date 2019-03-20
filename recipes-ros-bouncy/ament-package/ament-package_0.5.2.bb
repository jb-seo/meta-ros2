# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The parser for the manifest files in the ament buildsystem."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "python3-setuptools"
SRC_URI = "https://github.com/ros2-gbp/ament_package-release/archive/release/bouncy/ament_package/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "75e98209706f6eed8bbb449c3e3194d1"
SRC_URI[sha256sum] = "bca69aac44d4010473a9c8b2676eef3539679f003b80994ea1f75c35141bffe2"
S = "${WORKDIR}/ament_package-release-release-bouncy-ament_package-0.5.2-0"


inherit ros
inherit setuptools3

BBCLASSEXTEND += "native"