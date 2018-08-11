# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check code against the style conventions in PEP 8 and     generate xUnit test result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "pydocstyle"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_pep257/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "11e4d8c36f61d5c47b2106521cef1f02"
SRC_URI[sha256sum] = "e15a410cc86b8d562c91a6f59c00db7ae1263b6a469c673a9385f97eac86ca36"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_pep257-0.5.2-0"

inherit catkin
