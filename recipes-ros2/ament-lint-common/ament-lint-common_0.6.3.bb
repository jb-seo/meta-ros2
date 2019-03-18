# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The list of commonly used linters in the ament buildsytem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-copyright ament-cmake-core ament-cmake-cppcheck ament-cmake-cpplint ament-cmake-export-dependencies ament-cmake-flake8 ament-cmake-lint-cmake ament-cmake-pep257 ament-cmake-uncrustify ament-cmake-xmllint"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_lint_common/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "31991fa0dda3c5842fa1c8595a2c9c03"
SRC_URI[sha256sum] = "47c855c5c0ce784998f6a4efa24fe05ad689bd7049a40200b85f936cca311451"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_lint_common-0.6.3-0"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
