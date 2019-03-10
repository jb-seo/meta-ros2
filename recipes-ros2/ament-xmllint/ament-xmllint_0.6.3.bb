# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check XML files like the package manifest using xmllint     and generate xUnit test result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "libxml2-utils"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_xmllint/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "520937b03b13d7f28e2e76738239ca1e"
SRC_URI[sha256sum] = "76acb21a3c2dda49e997cf277845d2c04354c8e0fc3126f7d971b7832a1e9c8b"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_xmllint-0.6.3-0"

inherit catkin
