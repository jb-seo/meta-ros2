# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The list of commonly used linters in the ament buildsytem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-copyright ament-cmake-core ament-cmake-cppcheck ament-cmake-cpplint ament-cmake-export-dependencies ament-cmake-flake8 ament-cmake-lint-cmake ament-cmake-pep257 ament-cmake-uncrustify"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_lint_common/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a23b014cc55d48b54397c4833cd9715a"
SRC_URI[sha256sum] = "2db429fee8c315e3e889ed1df2d3b69f7f84faedcc38761608a0ac3a74ddc6e9"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_lint_common-0.5.2-0"


inherit ros
inherit ament

BBCLASSEXTEND += "native"