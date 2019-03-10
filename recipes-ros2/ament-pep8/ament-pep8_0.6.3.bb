# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check code against the style conventions in PEP 8 and     generate xUnit test result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "python3-pep8"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_pep8/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ab338af3093c5ef486d069b7425f93a4"
SRC_URI[sha256sum] = "5cc9c59378497b8c9a9af103b0bd562fc2fcdc08c7cac396c2e558da1db1927a"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_pep8-0.6.3-0"

inherit catkin
