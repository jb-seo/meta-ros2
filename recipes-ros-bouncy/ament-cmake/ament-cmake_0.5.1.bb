# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The entry point package for the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-export-definitions ament-cmake-export-dependencies ament-cmake-export-include-directories ament-cmake-export-interfaces ament-cmake-export-libraries ament-cmake-export-link-flags ament-cmake-libraries ament-cmake-python ament-cmake-target-dependencies ament-cmake-test cmake"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a55a85bbf8645fb5e561b691cdde2b80"
SRC_URI[sha256sum] = "b1f37dc2b4adf57bf29a62a2dc88c2cec7948bdee13e66e89d7c203c100d842e"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake-0.5.1-0"

inherit ros
inherit cmake python3native


BBCLASSEXTEND += "native"