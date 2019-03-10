# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check code against the style conventions in PEP 8 and     generate xUnit test result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "pydocstyle"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_pep257/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "749fae89e4083351fb0807aef8d2a8d6"
SRC_URI[sha256sum] = "62090dc71e619892fee461bba1d00289bd1a6d52e5f3cf18219ec780e37fa752"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_pep257-0.6.3-0"

inherit catkin
