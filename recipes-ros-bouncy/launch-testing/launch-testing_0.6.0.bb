# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Helper scripts for tests that use the ROS launch tool."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "launch"
SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/bouncy/launch_testing/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9d8d50a8cbf9c125df3eef0393c4f4d0"
SRC_URI[sha256sum] = "75e6052d3aae65fa858f627ba22c6dbdc27c0aacfde4af92e0a165d3fd7a3035"
S = "${WORKDIR}/launch-release-release-bouncy-launch_testing-0.6.0-0"


inherit ros
inherit setuptools3

