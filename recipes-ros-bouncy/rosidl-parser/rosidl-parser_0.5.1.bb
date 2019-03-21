# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The parser for ROS interface files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/bouncy/rosidl_parser/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "88848d08b11923ad58211ececf89c141"
SRC_URI[sha256sum] = "deb8d27adf42635ae212ae393b3a1b9fcc86b73eb0836768349f66fc786c1fcd"
S = "${WORKDIR}/rosidl-release-release-bouncy-rosidl_parser-0.5.1-0"

inherit ros
inherit ament


